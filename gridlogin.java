// Student: Bina Khatri
//lab 5
import javax.swing.*;
import java.awt.*;

public class gridlogin extends JFrame {

    JLabel userLabel, passLabel;
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    public gridlogin() {

        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create GridLayout with 3 rows and 2 columns
        setLayout(new GridLayout(3, 2, 10, 10));

        // Username
        userLabel = new JLabel("Username:");
        userField = new JTextField();

        // Password
        passLabel = new JLabel("Password:");
        passField = new JPasswordField();

        // Login Button
        loginButton = new JButton("Login");

        // Add components
        add(userLabel);
        add(userField);

        add(passLabel);
        add(passField);

        add(new JLabel(""));
        add(loginButton);

        // Login button action
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gridlogin();
    }
}