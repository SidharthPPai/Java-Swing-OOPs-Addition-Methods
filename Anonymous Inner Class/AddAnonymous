//////////////////////////////////////////////
//
//1.Swing addition using Anonymous inner class
//--------------------------------------------
// javac AddAnonymous.java
// java AddAnonymous

/*
local Class without a name which is delcared and instantiated in a single expression
------------------------------------------------------------------------------------
An anonymous inner class in Java is a class that is declared and instantiated at the same time without giving it a name.
It is usually used when you need to override a method of a class or interface only once.

*/

import javax.swing.*;
import java.awt.event.*;

public class AddAnonymous extends JFrame {

    public AddAnonymous() {
        setTitle("Addition using Anonymous class");

        JLabel label1 = new JLabel("First Number: ");
        JLabel label2 = new JLabel("Second Number: ");
        JLabel resLabel = new JLabel("Result:");

        JTextField txtField1 = new JTextField();
        JTextField txtField2 = new JTextField();

        JButton addButton = new JButton("Add");

        label1.setBounds(30, 30, 100, 25);
        txtField1.setBounds(140, 30, 150, 25);

        label2.setBounds(30, 70, 100, 25);
        txtField2.setBounds(140, 70, 150, 25);

        addButton.setBounds(110, 110, 100, 30);
        resLabel.setBounds(30, 160, 250, 25);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtField1.getText());
                    int num2 = Integer.parseInt(txtField2.getText());
                    int sum = num1 + num2;
                    resLabel.setText("Result : " + sum);
                } catch (NumberFormatException ex) { 
                    resLabel.setText("Error : please enter valid numbers");
                }
            }
        });

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

    public static void main(String[] args) {
       
        new AddAnonymous();
    }
}
