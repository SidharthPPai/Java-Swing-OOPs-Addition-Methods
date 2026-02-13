//////////////////////////////////////////////
//
//3.Swing addition using Method Handle
//--------------------------------------------
// javac AddMethodHandle.java
// java AddMethodHandle

/*

A Method Handle in Java is a typed, directly executable reference to a method, constructor, or field.

*/

import javax.swing.*;
import java.awt.event.*;

public class AddMethodHandle extends JFrame {

    // Declare components at class level
    JTextField txtField1;
    JTextField txtField2;
    JLabel resLabel;

    public AddMethodHandle() {

        setTitle("Addition using Method Handle");

        JLabel label1 = new JLabel("First Number :");
        JLabel label2 = new JLabel("Second Number :");
        resLabel = new JLabel("Result : ");

        txtField1 = new JTextField();
        txtField2 = new JTextField();

        JButton addButton = new JButton("ADD");

        label1.setBounds(30, 30, 100, 25);
        txtField1.setBounds(140, 30, 150, 25);

        label2.setBounds(30, 70, 100, 25);
        txtField2.setBounds(140, 70, 150, 25);

        addButton.setBounds(110, 110, 100, 30);
        resLabel.setBounds(30, 160, 250, 25);

        // Method reference to non-static method
        addButton.addActionListener(this::handleAddition);

        add(label1);
        add(txtField1);
        add(label2);
        add(txtField2);
        add(addButton);
        add(resLabel);

        setSize(350, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    private void handleAddition(ActionEvent e) {
        int num1 = Integer.parseInt(txtField1.getText());
        int num2 = Integer.parseInt(txtField2.getText());
        int sum = num1 + num2;

        resLabel.setText("Result : " + sum);
    }

    public static void main(String[] args) {
        new AddMethodHandle();
    }
}
