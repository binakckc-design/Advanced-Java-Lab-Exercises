import javax.swing.*;
import java.awt.*;

public class lab2 {

    public static void main(String[] args) {

        // Create the main frame
        JFrame frame = new JFrame("Swing Layout Manager Demo");

        // Set the size of the frame
        frame.setSize(500, 300);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout for the main frame
        frame.setLayout(new BorderLayout());

        // =====================================================
        // NORTH PANEL
        // =====================================================

        JPanel northPanel = new JPanel();

        // Use FlowLayout for North Panel
        northPanel.setLayout(new FlowLayout());

        // Create three labels
        JLabel nameLabel = new JLabel("Name: Bina");
        JLabel rollLabel = new JLabel("Roll No: 10");
        JLabel classLabel = new JLabel("Class: BCA");

        // Add labels to North Panel
        northPanel.add(nameLabel);
        northPanel.add(rollLabel);
        northPanel.add(classLabel);

        // Add North Panel to the North region of frame
        frame.add(northPanel, BorderLayout.NORTH);


        // =====================================================
        // CENTER PANEL
        // =====================================================

        JPanel centerPanel = new JPanel();

        // Use GridLayout with 3 rows and 2 columns
        centerPanel.setLayout(new GridLayout(3, 2, 10, 10));

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Remember Me checkbox
        JCheckBox rememberBox = new JCheckBox("Remember Me");

        // Login button
        JButton loginButton = new JButton("Login");

        // Add components to Center Panel
        centerPanel.add(usernameLabel);
        centerPanel.add(usernameField);

        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);

        centerPanel.add(rememberBox);
        centerPanel.add(loginButton);

        // Add Center Panel to the Center region
        frame.add(centerPanel, BorderLayout.CENTER);


        // =====================================================
        // SOUTH PANEL
        // =====================================================

        JPanel southPanel = new JPanel();

        // Use FlowLayout for South Panel
        southPanel.setLayout(new FlowLayout());

        // Create Reset and Exit buttons
        JButton resetButton = new JButton("Reset");
        JButton exitButton = new JButton("Exit");

        // Add buttons to South Panel
        southPanel.add(resetButton);
        southPanel.add(exitButton);

        // Add South Panel to the South region
        frame.add(southPanel, BorderLayout.SOUTH);


        // =====================================================
        // BUTTON ACTIONS
        // =====================================================

        // Reset button
        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
            rememberBox.setSelected(false);
        });

        // Exit button
        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}