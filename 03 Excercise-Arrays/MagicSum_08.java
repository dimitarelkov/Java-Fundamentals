package Excercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        
        int number = Integer.parseInt(scanner.nextLine());
        int sumElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sumElement = array[i] + array[j];
                if (sumElement == number) {
                    System.out.println(array[i] + " " + array[j]);
            }

            }

            }
        }
    }

