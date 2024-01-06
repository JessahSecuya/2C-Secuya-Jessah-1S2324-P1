import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LogIn extends UIFrame implements UI, ActionListener {
    private final int width = 500;
    private final int height = 500;
    private double bal;
    private String email;
    private char[] confirmPass;
    private JTextField e_maiilTextBox = new JTextField();
    private JPasswordField userPassword = new JPasswordField();
    private JLabel e_mail = new JLabel("E-Mail: ");
    private JLabel password = new JLabel("Password: ");
    private JButton login = new JButton("Log In");
    private JButton signup = new JButton("Create new account");
    public void logInFrame(){
        UIForm();
        super.structure(width, height, "LogIn");
    }

    @Override
    public void UIForm(){
        //E-Mail
        e_mail.setBounds(80, 100, 90, 25);
        e_maiilTextBox.setBounds(150,100,200, 25);
        this.frame.add(e_mail);
        this.frame.add(e_maiilTextBox);

        //PASSWORD
        password.setBounds(80, 150, 90, 25);
        userPassword.setBounds(150,150,200,25);
        this.frame.add(password);
        this.frame.add(userPassword);

        //LOG IN BUTTON
        login.setBounds(190, 210, 100, 30);
        login.setForeground(Color.WHITE);
        login.setBackground(new Color(0x0866ff));
        login.addActionListener(this);
        this.frame.add(login);

        //CREATING NEW ACCOUNT BUTTON
        signup.setBounds(159, 250, 155, 30);
        signup.setForeground(Color.WHITE);
        signup.setBackground(new Color(0x42b72a));
        signup.addActionListener(this);
        this.frame.add(signup);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mail = e_maiilTextBox.getText();
        char[] pass = userPassword.getPassword();

        if(e.getSource() == login){
            if(getEmail() == null && getConfirmPass() == null) {
                JOptionPane.showMessageDialog(null, "The email or password you entered isn’t connected to an account. Create a new account", "Message", JOptionPane.INFORMATION_MESSAGE);
            }else if(mail.equals(getEmail()) && Arrays.equals(pass, getConfirmPass())){
                this.frame.dispose();
                Account acc = new Account();
                acc.accountStructure();
                acc.setMail(getEmail());
                acc.setPass(getConfirmPass());
                acc.setBalance(getBal());
            }else{
                JOptionPane.showMessageDialog(null, "Wrong E-Mail or Password", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
       if(e.getSource() == signup) {
           this.frame.dispose();
           new UserInfo();
       }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(char[] confirmPass) {
        this.confirmPass = confirmPass;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
