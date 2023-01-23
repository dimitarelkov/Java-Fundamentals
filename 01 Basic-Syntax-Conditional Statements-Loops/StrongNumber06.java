package Excercise01;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFact = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            int fact = 1;

            for (int i = lastDigit; i > 0 ; i--) {
                fact *= i;
        }
            sumFact += fact;
            number /= 10;

            
        }
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
