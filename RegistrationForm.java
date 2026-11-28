import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("User Registration Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use FlowLayout
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        // Group gender radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Country
        JLabel countryLabel = new JLabel("Country:");
        String countries[] = {"Nepal", "India", "USA", "Australia"};
        JComboBox<String> country = new JComboBox<>(countries);

        // Hobbies
        JLabel hobbyLabel = new JLabel("Hobbies:");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");

        // Submit button
        JButton submit = new JButton("Submit");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(addressLabel);
        frame.add(addressField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        frame.add(countryLabel);
        frame.add(country);

        frame.add(hobbyLabel);
        frame.add(reading);
        frame.add(music);
        frame.add(sports);

        frame.add(submit);

        // Submit button action
        submit.addActionListener(e -> {

            String gender = "";

            if (male.isSelected())
                gender = "Male";
            else if (female.isSelected())
                gender = "Female";

            String hobbies = "";

            if (reading.isSelected())
                hobbies += "Reading ";

            if (music.isSelected())
                hobbies += "Music ";

            if (sports.isSelected())
                hobbies += "Sports ";

            // Display entered information
            JOptionPane.showMessageDialog(frame,
                    "Name: " + nameField.getText()
                    + "\nAddress: " + addressField.getText()
                    + "\nEmail: " + emailField.getText()
                    + "\nGender: " + gender
                    + "\nCountry: " + country.getSelectedItem()
                    + "\nHobbies: " + hobbies);
        });

        // Display frame
        frame.setVisible(true);
    }
}
