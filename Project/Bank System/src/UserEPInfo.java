import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UserEPInfo extends UIFrame implements UI, ActionListener {
    private int width = 500;
    private int height = 400;
    private String usersE_mail;
    private char[] usersPassword;
    private char[] confirmPass;
    private LogIn log = new LogIn();
    private Account acc = new Account();
    private JLabel e_mail = new JLabel("E-mail: ");
    private JLabel password = new JLabel("New Password: ");
    private JLabel confirmPassword = new JLabel("Re-enter Password: ");
    private JTextField e_mailBox = new JTextField();
    private JPasswordField passwordBox = new JPasswordField();
    private JPasswordField confirmPasswordBox = new JPasswordField();
    private JButton submit = new JButton("SUBMIT");
    private JButton logIn = new JButton("<< Back to LogIn");
    public UserEPInfo(){
        UIForm();
        super.structure(width, height, "Sign Up");
    }

    @Override
    public void UIForm() {
        //E-MAIL
        e_mail.setBounds(80, 70, 90, 25);
        e_mailBox.setBounds(210, 70, 190, 25);
        this.frame.add(e_mail);
        this.frame.add(e_mailBox);

        //NEW PASSWORD
        password.setBounds(80, 120, 120, 25);
        passwordBox.setBounds(210, 120, 190, 25);
        this.frame.add(password);
        this.frame.add(passwordBox);

        //RE-ENTER PASSWORD
        confirmPassword.setBounds(80, 170, 150, 25);
        confirmPasswordBox.setBounds(210, 170, 190, 25);
        this.frame.add(confirmPassword);
        this.frame.add(confirmPasswordBox);

        //SUBMIT BUTTON
        submit.setBounds(120, 230, 90, 25);
        submit.setForeground(Color.WHITE);
        submit.setBackground(new Color(0x0866ff));
        submit.addActionListener(this);
        this.frame.add(submit);

        //BACK BUTTON
        logIn.setBounds(250, 230, 150, 25);
        logIn.setForeground(Color.WHITE);
        logIn.setBackground(new Color(0x0866ff));
        logIn.addActionListener(this);
        this.frame.add(logIn);
    }
    private void getUserEP(){
        usersE_mail = e_mailBox.getText();
        usersPassword = passwordBox.getPassword();
        confirmPass = confirmPasswordBox.getPassword();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getUserEP();
        if(e.getSource() == submit) {
            if(!Arrays.equals(usersPassword, confirmPass)){
                JOptionPane.showMessageDialog(null, "Your Password does not match", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Creating an account is successful", "Message", JOptionPane.INFORMATION_MESSAGE);
                printEP();
                log.setEmail(usersE_mail);
                log.setConfirmPass(usersPassword);
                e_mailBox.setText("");
                passwordBox.setText("");
                confirmPasswordBox.setText("");
            }
        }else if(e.getSource() == logIn){
            this.frame.dispose();
            log.logInFrame();
        }
    }

    private void printEP(){
        System.out.println("E-Mail: " + usersE_mail);
        System.out.print("Password: ");
        System.out.println(confirmPass);
    }
}
