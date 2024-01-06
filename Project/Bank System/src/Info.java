import javax.swing.*;
import java.awt.*;

public class Info extends UIFrame implements UI{
    private final int width = 600;
    private final int height = 700;
    private JLabel fullName, firstName, lastName, age, gender, dateOfBirth, month, day, year, address, city, municipality, zipcode, contactNumber, occupation;
    private JTextField firstNameBox, lastNameBox, ageBox, monthBox, dayBox, yearBox, cityBox, municipalityBox, zipcodeBox, contactNumberBox, occupationBox;
    private JRadioButton male, female;
    public Info(){
        UIForm();
        super.structure(width, height, "Sign Up");
    }

    @Override
    public void UIForm() {
        //FULL NAME
        fullName = new JLabel("FULL NAME");
        fullName.setBounds(20, 20, 100, 25);
        fullName.setFont(new Font("Calibri", Font.BOLD, 20));
        this.frame.add(fullName);

        //FIRST NAME & LAST NAME
        firstName = new JLabel("First Name");
        firstNameBox = new JTextField();
        lastName = new JLabel("Last Name");
        lastNameBox = new JTextField();
        firstName.setBounds(20, 50, 90, 25);
        firstNameBox.setBounds(90, 50, 120, 25);
        lastName.setBounds(250, 50, 90, 25);
        lastNameBox.setBounds(320, 50, 120, 25);
        this.frame.add(firstName);
        this.frame.add(firstNameBox);
        this.frame.add(lastName);
        this.frame.add(lastNameBox);

        //AGE & GENDER
        age = new JLabel("AGE");
        gender = new JLabel("GENDER");
        ageBox = new JTextField();
        age.setBounds(20, 100, 50, 25);
        age.setFont(new Font("Calibri", Font.BOLD, 20));
        gender.setBounds(170, 100, 90, 25);
        gender.setFont(new Font("Calibri", Font.BOLD, 20));
        ageBox.setBounds(20, 130, 90, 25);
        male = new JRadioButton("Male");
        male.setBounds(170, 130, 90, 25);
        female = new JRadioButton("Female");
        female.setBounds(290, 130, 90, 25);
        male.setSelected(true);
        this.frame.add(age);
        this.frame.add(gender);
        this.frame.add(ageBox);
        this.frame.add(male);
        this.frame.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        //DATE OF BIRTH
        dateOfBirth = new JLabel("DATE OF BIRTH");
        dateOfBirth.setBounds(20, 190, 150, 25);
        dateOfBirth.setFont(new Font("Calibri", Font.BOLD, 20));
        month = new JLabel("Month");
        monthBox = new JTextField();
        month.setBounds(20, 225, 50, 25);
        monthBox.setBounds(60, 225, 45, 25);
        day = new JLabel("Day");
        dayBox = new JTextField();
        day.setBounds(120, 225, 30, 25);
        dayBox.setBounds(145, 225,45,25);
        year = new JLabel("Year");
        yearBox = new JTextField();
        year.setBounds(210, 225, 45, 25);
        yearBox.setBounds(240, 225, 45, 25);
        this.frame.add(dateOfBirth);
        this.frame.add(month);
        this.frame.add(monthBox);
        this.frame.add(day);
        this.frame.add(dayBox);
        this.frame.add(year);
        this.frame.add(yearBox);

        //ADDRESS
        address = new JLabel("ADDRESS");
        address.setBounds(20, 290, 90, 25);
        address.setFont(new Font("Calibri", Font.BOLD, 20));
        city = new JLabel("City");
        city.setBounds(20, 325, 40, 25);
        cityBox = new JTextField();
        cityBox.setBounds(50, 325, 90, 25);
        municipality = new JLabel("Municipality");
        municipality.setBounds(155, 325, 90, 25);
        municipalityBox = new JTextField();
        municipalityBox.setBounds(230, 325, 120, 25);
        zipcode = new JLabel("ZipCode");
        zipcode.setBounds(365, 325, 50, 25);
        zipcodeBox = new JTextField();
        zipcodeBox.setBounds(420, 325, 50, 25);
        this.frame.add(address);
        this.frame.add(city);
        this.frame.add(cityBox);
        this.frame.add(municipality);
        this.frame.add(municipalityBox);
        this.frame.add(zipcode);
        this.frame.add(zipcodeBox);

        //CONTACT NUMBER
        contactNumber = new JLabel("CONTACT NUMBER");
        contactNumber.setBounds(20, 390, 200, 25);
        contactNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        contactNumberBox = new JTextField();
        contactNumberBox.setBounds(20, 420, 150, 25);
        this.frame.add(contactNumber);
        this.frame.add(contactNumberBox);

        //OCCUPATION
        occupation = new JLabel("OCCUPATION");
        occupation.setBounds(20, 470, 120, 25);
        occupation.setFont(new Font("Calibri", Font.BOLD, 20));
        occupationBox = new JTextField();
        occupationBox.setBounds(20, 500, 150, 25);
        this.frame.add(occupation);
        this.frame.add(occupationBox);
    }
}
