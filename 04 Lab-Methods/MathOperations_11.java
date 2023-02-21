package Lab04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());

        char operator = scanner.nextLine().charAt(0);

        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case '+':
                System.out.println(add(number1, number2));
            break;
            case '-':
                System.out.println(subtraction(number1, number2));
                break;
            case '*':
                System.out.println(multiply(number1, number2));
                break;
            case '/':
                DecimalFormat formatPrint = new DecimalFormat("0.##");
                System.out.println(formatPrint.format(divide(number1, number2)));
                break;
        }
    }
    public static int add (int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    public static int subtraction (int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
    public static int multiply (int n1, int n2) {
        int result = n1 * n2;
        return result;
    }
    public static double divide (double n1, int n2) {
        double result = n1 / n2;
        return result;
    }
}
