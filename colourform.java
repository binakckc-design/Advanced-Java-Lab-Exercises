// Student: Bina Khatri
//lab 8
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class colourform extends JFrame implements ActionListener {

    JButton redButton, blueButton, greenButton;

    public colourform() {

        setTitle("Color Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        greenButton = new JButton("GREEN");

        // Add buttons to frame
        add(redButton);
        add(blueButton);
        add(greenButton);

        // Register action listeners
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == redButton) {
            getContentPane().setBackground(Color.RED);
        }
        else if (e.getSource() == blueButton) {
            getContentPane().setBackground(Color.BLUE);
        }
        else if (e.getSource() == greenButton) {
            getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new colourform();
    }
}