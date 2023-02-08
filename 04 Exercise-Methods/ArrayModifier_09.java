package Excercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            if (inputArr[0].equals("swap")) {
                int indexOne = Integer.parseInt(inputArr[1]);
                int indexTwo = Integer.parseInt(inputArr[2]);
                int numberOne = array[indexOne];
                int numberTwo = array[indexTwo];
                array[indexOne] = numberTwo;
                array[indexTwo] = numberOne;
            } else if (inputArr[0].equals("multiply")) {
                int indexOne = Integer.parseInt(inputArr[1]);
                int indexTwo = Integer.parseInt(inputArr[2]);
                int numberOne = array[indexOne];
                int numberTwo = array[indexTwo];
                int multiply = numberOne * numberTwo;
                array[indexOne] = multiply;
            } else if (inputArr[0].equals("decrease")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }
            input = scanner.nextLine();
        }

            for (int index = 0; index <= array.length - 1; index++) {
                if (index != array.length - 1) {
                    System.out.print(array[index] + ", ");
                } else {
                    System.out.print(array[index]);
                }

        }
    }
}
