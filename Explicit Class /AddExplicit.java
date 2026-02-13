//////////////////////////////////////////////
//
//5.Swing addition using Explicit method
//--------------------------------------------
// javac AddExplicit.java AdditionListener.java
// java AddExplicit



/*

A clearly defined, named class written separately by the programmer, instead of an anonymous or implicit class.

*/

import javax.swing.*;
import java.awt.event.*;

public class AddExplicit extends JFrame {

    JTextField txtField1;
    JTextField txtField2;
    JLabel resLabel;

    public AddExplicit() {

        setTitle("Addition using Explicit class");

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

        addButton.addActionListener(new AdditionListener(txtField1, txtField2, resLabel));

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
        new AddExplicit();
    }
}

