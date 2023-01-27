package Lab03_Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersString = scanner.nextLine();

        String[] numbersStringArr = numbersString.split(" ");
        int[] numbersArr = new int[numbersStringArr.length];

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(numbersStringArr[i]);
            if (numbersArr[i] % 2 == 0) {
                sumEven += numbersArr[i];
            } else {
                sumOdd += numbersArr[i];
            }
        }
        System.out.printf("%d", sumEven - sumOdd);

    }
}
