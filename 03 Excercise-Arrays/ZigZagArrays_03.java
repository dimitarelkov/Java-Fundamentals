package Excercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberRows = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[numberRows];
        int[] secondArr = new int[numberRows];

        for (int row = 1; row <= numberRows; row++) {

            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int firstNumber = input[0];
            int secondNumber = input[1];

           for (int i = 0; i <= input.length - 1; i++) {
               if (row % 2 != 0) {
                   firstArr[row - 1] = firstNumber;
                   secondArr[row - 1] = secondNumber;
               } else {
                   firstArr[row - 1] = secondNumber;
                   secondArr[row - 1] = firstNumber;
               }
            }
        }
        for (int number :
             firstArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number:
            secondArr) {
            System.out.print(number + " ");
        }
    }
}

