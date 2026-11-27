// Student: Bina Khatri
// lab 2
import java.awt.*;
import java.awt.event.*; // Contains the correct ActionEvent and ActionListener
import javax.swing.*;

public class sum extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3; // Changed from JLabel to JTextField so users can type inputs
    JButton b1;

    sum() {
        // Set layout to null because you are using absolute bounds (setBounds)
        setLayout(null);

        l1 = new JLabel("Enter first number:");
        l1.setBounds(50, 50, 150, 20);
        t1 = new JTextField(); // Changed to JTextField
        t1.setBounds(200, 50, 150, 20);

        l2 = new JLabel("Enter second number:");
        l2.setBounds(50, 100, 150, 20); // Fixed bounds height from 200 to 20
        t2 = new JTextField(); // Changed to JTextField
        t2.setBounds(200, 100, 150, 20);

        b1 = new JButton("Add");
        b1.setBounds(200, 150, 80, 30);
        b1.addActionListener(this); // Added the listener so the button works

        l3 = new JLabel("Result:"); // Initialized l3 to avoid NullPointerException
        l3.setBounds(50, 200, 150, 20);
        t3 = new JTextField(); 
        t3.setBounds(200, 200, 150, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        add(t3);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Fixed typo in method name and corrected the ActionEvent parameter type
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try{
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText(String.valueOf(c));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"please enter a valid integer");
        }
    }
}

    public static void main(String[] args) {
        new sum();
    }
}
