// Student: Bina Khatri
//lab 9
import javax.swing.*;
import java.awt.*;

public class Layout {

    public static void main(String[] args) {

        //Create main frame
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //North pannel
        JPanel northPanel = new JPanel(new FlowLayout());

        JLabel nameLabel = new JLabel("Name: Apil");
        JLabel rollLabel = new JLabel("Roll No: 03");
        JLabel classLabel = new JLabel("Class: 6th Semester");

        northPanel.add(nameLabel);
        northPanel.add(rollLabel);
        northPanel.add(classLabel);

        //Centre Pannel
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JCheckBox rememberMe = new JCheckBox("Remember Me");
        JButton loginButton = new JButton("Login");

        centerPanel.add(usernameLabel);
        centerPanel.add(usernameField);

        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);

        centerPanel.add(rememberMe);
        centerPanel.add(loginButton);

        //South Pannel
        JPanel southPanel = new JPanel(new FlowLayout());

        JButton resetButton = new JButton("Reset");
        JButton exitButton = new JButton("Exit");

        southPanel.add(resetButton);
        southPanel.add(exitButton);

        //Add pannels to frames

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);

        //Button Action

        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
            rememberMe.setSelected(false);
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        loginButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    frame,
                    "Login button clicked!"
            );
        });

        //Display frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}