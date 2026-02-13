//////////////////////////////////////////////
//
//2.Swing addition using Lambda class
//--------------------------------------------
// javac AddLambda.java
// java AddLambda

/*
This class provides more concise alternative to anonymous inner class
--------------------------------------------------------------------------
A lambda expression in Java is a short, anonymous function used to implement a functional interface (an interface with only one abstract method).	

*/

import javax.swing.*;

public class AddLambda extends JFrame {

	public AddLambda(){

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


		addButton.addActionListener(e -> {
			int num1 = Integer.parseInt(txtField1.getText());
			int num2 = Integer.parseInt(txtField2.getText());

			int sum = num1 + num2;

			resLabel.setText("Result : " + sum);

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
       
        new AddLambda();
    	}



}
