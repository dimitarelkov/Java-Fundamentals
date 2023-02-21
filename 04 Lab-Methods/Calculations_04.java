package Lab04_Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculationMethod = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (calculationMethod.equals("add")) {
            add(number1, number2);
        } else if (calculationMethod.equals("multiply")) {
            multiply(number1, number2);
        } else if (calculationMethod.equals("subtract")) {
            subtract(number1, number2);
        } else {
            divide(number1, number2);
        }


    }
    public static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    public static void divide(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
