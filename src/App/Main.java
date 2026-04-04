

import test.*;


void main() throws Exception {

    Scanner sc = new Scanner(System.in);


    Multiplication Multiply = new Multiplication();
    Addition Add = new Addition();
    Subtraction Subtract = new Subtraction();
    Division Divide = new Division();
    Vaildtor validator = new Vaildtor();

    String input1;
    while (true) {
        System.out.println("Enter first number or exit : ");
        input1 = sc.next();
        if (input1.equals("exit")) {

            return;
        }

        if (validator.isValidNumber(input1)) {
            break;
        }

        System.out.println("Invalid input. Enter a number only.");
    }

    double w = Double.parseDouble(input1);
    String op;
    while (true) {
        System.out.println("Enter operator or exit: ");
        op = sc.next();
        if (op.equals("exit")) {
            return;
        }

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            break;
        }

        System.out.println("Invalid operator. Use + - * / only.");
    }
    String input2;
    while (true) {
        System.out.println("Enter second number or exit : ");
        input2 = sc.next();
        if (input2.equals("exit")) {
            return;
        }

        if (validator.isValidNumber(input2)) {
            break;
        }

        System.out.println("Invalid input. Enter a number only.");
    }

    double s = Double.parseDouble(input2);
    double result = 0;
    if (op.equals("-")) {
        result = Subtract.calculate(w, s);
    } else if (op.equals("/")) {
        result = Divide.calculate(w, s);

    } else if (op.equals("*")) {
        result = Multiply.calculate(w, s);
    } else if (op.equals("+")) {
        result = Add.calculate(w, s);
    }


    if (s == 0) {
        System.out.println(" ");
    } else System.out.println("Result: " + w + " " + op + " " + s + " = " + result);


}
