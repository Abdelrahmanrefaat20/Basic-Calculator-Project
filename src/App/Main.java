

import test.*;


void main() throws Exception {

    Scanner sc = new Scanner(System.in);


    Multiplication multiplication = new Multiplication();
    Addition addition = new Addition();
    Subtraction minus = new Subtraction();
    Division divide = new Division();
    Vaildtor validator = new Vaildtor();

    String input1;
    while (true) {
        System.out.println("Enter first number: ");
        input1 = sc.next();

        if (validator.isValidNumber(input1)) {
            break;
        }

        System.out.println("Invalid input. Enter a number only.");
    }

    double w = Double.parseDouble(input1);
    String op;
    while (true) {
        System.out.println("Enter operator: ");
        op = sc.next();

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            break;
        }

        System.out.println("Invalid operator. Use + - * / only.");
    }
    String input2;
    while (true) {
        System.out.println("Enter second number: ");
        input2 = sc.next();

        if (validator.isValidNumber(input2)) {
            break;
        }

        System.out.println("Invalid input. Enter a number only.");
    }

    double s = Double.parseDouble(input2);
    double result = 0;
    if (op.equals("-")) {
        result = minus.calculate(w, s);
    } else if (op.equals("/")) {
        result = divide.calculate(w, s);

    } else if (op.equals("*")) {
        result = multiplication.calculate(w, s);
    } else if (op.equals("+")) {
        result = addition.calculate(w, s);
    }


    if (s == 0) {
        System.out.println(" ");
    } else System.out.println("Result: " + w + " " + op + " " + s + " = " + result);


}
