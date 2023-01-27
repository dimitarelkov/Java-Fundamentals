package Lab03_Arrays;

import java.awt.*;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersString = scanner.nextLine();
        String[] numberStringArr = numbersString.split(" ");
        int[] numbersArr = new int[numberStringArr.length];

        int sum = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(numberStringArr[i]);

            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
