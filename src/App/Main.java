

import test.*;


void main() throws Exception {

    Scanner sc = new Scanner(System.in);


    operations Multiply = new Multiplication();
    operations Add = new Addition();
    operations Subtract = new Subtraction();
    operations Divide = new Division();
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

    double input_1 = Double.parseDouble(input1);

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
        System.out.println(" ");
    } else System.out.println("Result: " + input_1 + " " + op + " " + input_2 + " = " + result);


}
