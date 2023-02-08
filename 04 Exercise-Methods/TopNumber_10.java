package Excercise03_Arrays;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {

            if((sumDivisibleEight(i) % 8 == 0) && oddDigit(i)) {
                System.out.println(i);
            }

        }

    }

    public static int sumDivisibleEight(int number) {

        int sumDigit = 0;

        String numberText = Integer.toString(number);

        for (int i = 0; i < numberText.length(); i++) {
            int lastDigit = number % 10;
            sumDigit += lastDigit;
            number = number / 10;

           }
        return sumDigit;
    }

    public static boolean oddDigit(int number) {
        boolean isOddDigit = false;
        String numberText = Integer.toString(number);

        for (int i = 0; i < numberText.length(); i++) {
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 != 0) {
                isOddDigit = true;
                break;

            }

        }
        return isOddDigit;
    }
}
