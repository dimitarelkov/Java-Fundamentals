package Excercise03_Arrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        int rotationNumber = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotationNumber ; rotation++) {

            String firstElement = inputArray[0];

            for (int index = 0; index < inputArray.length - 1; index++) {
                inputArray[index] = inputArray[index + 1];

            }
            inputArray[inputArray.length - 1] = firstElement;



            }
        for (String arrayElement :
                inputArray) {
            System.out.print(arrayElement + " ");
        }
    }
}
