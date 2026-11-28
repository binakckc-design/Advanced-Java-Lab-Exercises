// Student: Bina Khatri
//lab 6
import javax.swing.*;
import java.awt.*;

public class gridbag extends JFrame {

    JLabel userLabel, passLabel;
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    public gridbag() {

        setTitle("Login Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create GridBagLayout
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;

        userLabel = new JLabel("Username:");
        add(userLabel, gbc);

        // Username Text Field
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        userField = new JTextField(15);
        add(userField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;

        passLabel = new JLabel("Password:");
        add(passLabel, gbc);

        // Password Field
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        passField = new JPasswordField(15);
        add(passField, gbc);

        // Login Button
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;

        loginButton = new JButton("Login");
        add(loginButton, gbc);

        // Button event
        loginButton.addActionListener(e -> {

            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password!");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gridbag();
    }
}