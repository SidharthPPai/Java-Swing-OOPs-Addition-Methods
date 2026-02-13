import java.awt.event.*;
import javax.swing.*;

public class AdditionListener implements ActionListener {

    private JTextField txtField1;
    private JTextField txtField2;
    private JLabel resLabel;

    public AdditionListener(JTextField t1, JTextField t2, JLabel resultLabel) {
        this.txtField1 = t1;
        this.txtField2 = t2;
        this.resLabel = resultLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(txtField1.getText());
        int num2 = Integer.parseInt(txtField2.getText());

        int sum = num1 + num2;

        resLabel.setText("Result: " + sum);
    }
}
