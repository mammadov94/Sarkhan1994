package Lesson18;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите операцию (+, -, /, *)");
        char operation = sc.nextLine().charAt(0);
        System.out.println("Введите любое число");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        Operation operation1 = Operation.getOperation(operation);
        System.out.println(calculate(number1, number2,operation1));
    }

    public static Double calculate(double a, double b, Operation operation) {
        if (operation == Operation.SUM) {
            return a + b;
        }
        if (operation == Operation.SUBTRACT) {
            return a - b;
        }
        if (operation == Operation.MULTIPLY) {
            return a * b;
        }
        if (operation == Operation.DIVIDE) {
            return a / b;
        }
        return a;
    }
}
