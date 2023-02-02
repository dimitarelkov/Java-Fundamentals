package Excercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();

        for (int index = 0; index <= input.length - 1; index++) {
            int currantNumber = input[index];

            if (index == input.length - 1) {
                System.out.print(currantNumber + " ");
            }

            boolean isTop = false;

            for (int i = index + 1; i < input.length; i++) {
               int rightNumber = input[i];

               if (currantNumber > rightNumber) {
                    isTop = true;
               } else {
                   isTop = false;
                   break;
               }

            }
            if (isTop) {
                System.out.print(currantNumber + " ");
            }
            }
        }
    }
