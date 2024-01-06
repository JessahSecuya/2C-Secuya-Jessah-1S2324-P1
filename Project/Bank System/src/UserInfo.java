import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class UserInfo extends UIFrame implements UI, ActionListener {
    private final int width = 500;
    private final int height = 500;
    private String userName;
    private String usersAddress;
    private String userBirthMonth;
    private int usersAge;
    private int userBirthDay;
    private int userBirthYear;
    private JLabel name = new JLabel("Name");
    private JLabel ageLabel = new JLabel("Age");
    private JLabel gender = new JLabel("Gender");
    private JLabel birthDate = new JLabel("Birth Date");
    private JLabel address = new JLabel("Address");
    private JLabel month = new JLabel("M");
    private JLabel day = new JLabel("| D");
    private JLabel year = new JLabel("| Y");
    private JTextField nameBox = new JTextField();
    private JTextField ageBox = new JTextField();
    private JTextField addressBox = new JTextField();
    private JTextField monthBox = new JTextField();
    private JTextField dayBox = new JTextField();
    private JTextField yearBox = new JTextField();
    private JButton next = new JButton("Next >>");
    private JRadioButton male = new JRadioButton("Male");
    private JRadioButton female = new JRadioButton("Female");
    private  ButtonGroup group;
    public UserInfo(){
        UIForm();
        super.structure(width,height, "Sign Up");
    }
    @Override
    public void UIForm(){
        //NAME
        name.setBounds(50, 50, 90, 25);
        nameBox.setBounds(150, 50, 190, 25);
        this.frame.add(name);
        this.frame.add(nameBox);

        //AGE
        ageLabel.setBounds(50, 100, 90, 25);
        ageBox.setBounds(150, 100, 50, 25);
        this.frame.add(ageLabel);
        this.frame.add(ageBox);

        //GENDER
        gender.setBounds(50, 150, 90, 25);
        male.setBounds(150, 150, 90, 25);
        female.setBounds(250, 150, 90, 25);
        male.setSelected(true);
        this.frame.add(gender);
        this.frame.add(male);
        this.frame.add(female);

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        //BIRTH DATE
        birthDate.setBounds(50, 200, 90, 25);
        month.setBounds(150, 200, 20, 25);
        monthBox.setBounds(165,200,40,25);
        day.setBounds(210, 200, 30, 25);
        dayBox.setBounds(230, 200, 40, 25);
        year.setBounds(280, 200, 30, 25);
        yearBox.setBounds(300, 200, 40,25);
        this.frame.add(birthDate);
        this.frame.add(month);
        this.frame.add(monthBox);
        this.frame.add(day);
        this.frame.add(dayBox);
        this.frame.add(year);
        this.frame.add(yearBox);

        //ADDRESS
        address.setBounds(50, 250, 90, 25);
        addressBox.setBounds(150, 250, 190, 25);
        this.frame.add(address);
        this.frame.add(addressBox);

        //BUTTON
        next.setBounds(190, 320, 90, 25);
        next.setForeground(Color.WHITE);
        next.setBackground(new Color(0x0866ff));
        next.addActionListener(this);
        this.frame.add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isTrue = false;
        if(e.getSource() == next){
            try {
                getInfo();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Age, Day, or Year shuould be an Integer.", "ERROR", JOptionPane.ERROR_MESSAGE);
                isTrue = true;
            }

            if(isTrue == false){
                this.frame.dispose();
                printInfo();
                new UserEPInfo();
            }
        }
    }

    private void getInfo(){
            userName= nameBox.getText();
            userBirthMonth = monthBox.getText();
            usersAddress = addressBox.getText();
            usersAge= Integer.parseInt(ageBox.getText());
            userBirthDay = Integer.parseInt(dayBox.getText());
            userBirthYear = Integer.parseInt(yearBox.getText());
    }
    private String getSelectedButton(){
        for(Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();

            if(button.isSelected()){
                return button.getText();
            }
        }
        return null;
    }
    public void printInfo(){
        System.out.println("Name: " + userName);
        System.out.println("Age: " + usersAge);
        System.out.println("Gender: " + getSelectedButton());
        System.out.println("Birth Date: " + userBirthMonth + " " + userBirthDay  + ", " + userBirthYear);
        System.out.println("Address: " + usersAddress);
    }
}
