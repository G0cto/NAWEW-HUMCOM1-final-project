import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*' || operator == 'x' ||  operator == 'X') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        if (result == Math.floor(result)) {
            int resultInt = (int) result;
            System.out.println("Result: " + resultInt);
        } else {
            System.out.println("Result: " + result);
        }
    }
}
