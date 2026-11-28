// Student: Bina Khatri
//lab 4
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adapclass extends JFrame {

    JTextField t1, t2;
    JLabel labelResult;
    JButton actionButton;

    public adapclass() {
        setTitle("Sum and Difference Calculator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(50, 40, 120, 25);
        add(label1);

        t1 = new JTextField();
        t1.setBounds(180, 40, 150, 25);
        add(t1);

        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(50, 80, 120, 25);
        add(label2);

        t2 = new JTextField();
        t2.setBounds(180, 80, 150, 25);
        add(t2);

        actionButton = new JButton("Press and Release");
        actionButton.setBounds(120, 130, 160, 35);
        add(actionButton);

        labelResult = new JLabel("Result: ");
        labelResult.setBounds(50, 190, 300, 25);
        add(labelResult);

        actionButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int sum = num1 + num2;
                    labelResult.setText("Result (Sum): " + sum);

                } catch (NumberFormatException ex) {
                    labelResult.setText("Please enter valid numbers!");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int difference = num1 - num2;
                    labelResult.setText("Result (Difference): " + difference);

                } catch (NumberFormatException ex) {
                    labelResult.setText("Please enter valid numbers!");
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new adapclass();
    }
}