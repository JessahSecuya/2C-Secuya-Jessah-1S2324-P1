import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account extends UIFrame implements UI, ActionListener {
    private final int width = 480;
    private final int height = 500;
    private String mail;
    private char[]pass;
    private double balance;
    private double ammountWithdraw;
    private double ammountDeposit;
    private JButton checkBalance, withdraw, deposit, logout;
    public void accountStructure(){
        UIForm();
        super.structure(width, height, "Account");
    }

    @Override
    public void UIForm() {
        //CHECK BALANCE
        checkBalance = new JButton("CHECK BALANCE");
        checkBalance.setBounds(50, 90, 150, 100);
        checkBalance.setForeground(Color.WHITE);
        checkBalance.setBackground(new Color(0x353535));
        checkBalance.addActionListener(this);
        this.frame.add(checkBalance);

        //WITHDRAW
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(250, 90, 150, 100);
        withdraw.setForeground(Color.WHITE);
        withdraw.setBackground(new Color(0x353535));
        withdraw.addActionListener(this);
        this.frame.add(withdraw);

        //DEPOSIT
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(50, 250, 150, 100);
        deposit.setForeground(Color.WHITE);
        deposit.setBackground(new Color(0x353535));
        deposit.addActionListener(this);
        this.frame.add(deposit);

        //LOG OUT
        logout = new JButton("LOGOUT");
        logout.setBounds(250, 250, 150, 100);
        logout.setForeground(Color.WHITE);
        logout.setBackground(new Color(0xef233c));
        logout.addActionListener(this);
        this.frame.add(logout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkBalance){
            JOptionPane.showMessageDialog(null, "Your balance is " + balance);
        }else if(e.getSource() == withdraw){
            String w = JOptionPane.showInputDialog("Enter ammount: ");
            ammountWithdraw = Double.parseDouble(w);
            if(ammountWithdraw > balance){
                JOptionPane.showMessageDialog(null, "Sorry, your funds is insufficient.");
            }else if(ammountWithdraw < 0){
                JOptionPane.showMessageDialog(null, "Ammount should be greater than 1.");
            }else{
                balance -= ammountWithdraw;
                JOptionPane.showMessageDialog(null, "You've successfully withdrawn.");
            }
        }else if(e.getSource() == deposit){
            String d = JOptionPane.showInputDialog("Enter ammount: ");
            ammountDeposit = Double.parseDouble(d);

            if(ammountDeposit < 0){
                JOptionPane.showMessageDialog(null, "Ammount should be greater than 1.");
            }else{
                balance += ammountDeposit;
                JOptionPane.showMessageDialog(null, "You've succefully deposited an ammount.");
            }
        }else if(e.getSource() == logout){
            this.frame.dispose();
            LogIn log = new LogIn();
            log.logInFrame();
            log.setEmail(getMail());
            log.setConfirmPass(getPass());
            log.setBal(getBalance());
        }
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public char[] getPass() {
        return pass;
    }
    public void setPass(char[] pass) {
        this.pass = pass;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
