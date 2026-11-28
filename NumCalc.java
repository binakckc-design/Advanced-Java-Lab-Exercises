// Student: Bina Khatri
//lab 1
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NumCalc extends JFrame implements MouseListener {
    // UI Components
    JTextField t1, t2;
    JLabel labelResult;
    JButton actionButton;

    public NumCalc() {
        // Set up the window frame
        setTitle("Sum & Difference Calculator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First Number Input
        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(50, 40, 120, 25);
        add(label1);

        t1 = new JTextField();
        t1.setBounds(180, 40, 150, 25);
        add(t1);

        // Second Number Inputc
        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(50, 80, 120, 25);
        add(label2);

        t2 = new JTextField();
        t2.setBounds(180, 80, 150, 25);
        add(t2);

        // Interactive Button
        actionButton = new JButton("Press & Hold Me");
        actionButton.setBounds(120, 130, 160, 35);
        // Registering the MouseListener to track physical presses/releases
        actionButton.addMouseListener(this); 
        add(actionButton);

        // Output Label
        labelResult = new JLabel("Result: ");
        labelResult.setBounds(50, 190, 300, 25);
        add(labelResult);

        // Center the window on screen and display it
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Triggers the exact moment you hold down the mouse button
    @Override
    public void mousePressed(MouseEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            labelResult.setText("Result (Sum): " + sum);
        } catch (NumberFormatException ex) {
            labelResult.setText("Please enter valid integers!");
        }
    }

    // Triggers the exact moment you let go of the mouse button
    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int diff = num1 - num2;
            labelResult.setText("Result (Difference): " + diff);
        } catch (NumberFormatException ex) {
            labelResult.setText("Please enter valid integers!");
        }
    }

    // These 3 remaining methods are required by the MouseListener interface 
    // but can be left empty since we don't need them.
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        // Run the GUI application
        new NumCalc();
    }
}
