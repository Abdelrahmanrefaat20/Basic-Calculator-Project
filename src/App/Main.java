

import test.*;
import javax.swing.JOptionPane;


void main() throws Exception {

    operations Multiply = new Multiplication();
    operations Add = new Addition();
    operations Subtract = new Subtraction();
    operations Divide = new Division();
    Vaildtor validator = new Vaildtor();

    String input1;
    while (true) {
         input1 = JOptionPane.showInputDialog("Enter first number or exit : ");
        if (input1.equals("exit")) {

            return;
        }

        if (validator.isValidNumber(input1)) {
            break;
        }

        JOptionPane.showMessageDialog(null,"Invalid input. Enter a number only.");
    }

    double input_1 = Double.parseDouble(input1);

    String op;
    while (true) {

        op =  JOptionPane.showInputDialog("Enter operator or exit: ");
        if (op.equals("exit")) {
            return;
        }

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            break;
        }

        JOptionPane.showMessageDialog(null,"Invalid operator. Use + - * / only.");
    }
    String input2;
    while (true) {

        input2 = JOptionPane.showInputDialog("Enter second number or exit : ");
        if (input2.equals("exit")) {
            return;
        }

        if (validator.isValidNumber(input2)) {
            break;
        }

        JOptionPane.showMessageDialog(null,"Invalid input. Enter a number only.");
    }

    double input_2 = Double.parseDouble(input2);
    double result = 0;
    if (op.equals("-")) {
        result = Subtract.calculate(input_1, input_2);
    } else if (op.equals("/")) {
        result = Divide.calculate(input_1, input_2);

    } else if (op.equals("*")) {
        result = Multiply.calculate(input_1, input_2);
    } else if (op.equals("+")) {
        result = Add.calculate(input_1, input_2);
    }


    if (input_2 == 0 && op.equals("/")) {
        JOptionPane.showMessageDialog(null,"Error: divide by zero not allowed");
        return;
    } else JOptionPane.showMessageDialog(null,"Result: " + input_1 + " " + op + " " + input_2 + " = " + result);


}
