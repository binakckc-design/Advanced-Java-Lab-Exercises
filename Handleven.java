// Student: Bina Khatri
//lab 7
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Handleven extends JFrame implements ActionListener {

    JTextField firstNumber, secondNumber, result;
    JButton addButton, subtractButton, multiplyButton, divideButton;

    public Handleven() {

        setTitle("Border Layout Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // NORTH PANEL
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());

        JLabel title = new JLabel("Simple Calculator");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        northPanel.add(title);

        add(northPanel, BorderLayout.NORTH);

        // EAST PANEL
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(4, 1, 5, 5));

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");


        eastPanel.add(addButton);
        eastPanel.add(subtractButton);
        eastPanel.add(multiplyButton);
        eastPanel.add(divideButton);

        add(eastPanel, BorderLayout.EAST);

        // CENTER PANEL
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel firstLabel = new JLabel("First Number:");
        JLabel secondLabel = new JLabel("Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        firstNumber = new JTextField();
        secondNumber = new JTextField();
        result = new JTextField();

        result.setEditable(false);

        centerPanel.add(firstLabel);
        centerPanel.add(firstNumber);

        centerPanel.add(secondLabel);
        centerPanel.add(secondNumber);

        centerPanel.add(resultLabel);
        centerPanel.add(result);

        add(centerPanel, BorderLayout.CENTER);

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // SOUTH PANEL
        JPanel southPanel = new JPanel();
        southPanel.add(new JLabel("Enter numbers and select an operation."));
        add(southPanel, BorderLayout.SOUTH);

        // WEST PANEL
        JPanel westPanel = new JPanel();
        westPanel.add(new JLabel("Calculator"));
        add(westPanel, BorderLayout.WEST);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            double num1 = Double.parseDouble(firstNumber.getText());
            double num2 = Double.parseDouble(secondNumber.getText());
            double answer = 0;

            if (e.getSource() == addButton) {
                answer = num1 + num2;
            } 
            else if (e.getSource() == subtractButton) {
                answer = num1 - num2;
            } 
            else if (e.getSource() == multiplyButton) {
                answer = num1 * num2;
            } 
            else if (e.getSource() == divideButton) {

                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }

                answer = num1 / num2;
            }

            result.setText(String.valueOf(answer));

        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Handleven();
    }
}