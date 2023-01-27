package Lab03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] % 2 == 0) {
                sumEven += numbersArr[i];
            } else {
                sumOdd += numbersArr[i];
            }
        }
        System.out.printf("%d", sumEven - sumOdd);

    }
}
