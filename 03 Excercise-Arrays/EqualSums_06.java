package Excercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();
        boolean noIndex = true;

        for (int index = 0; index < inputArr.length; index++) {
            int currentNumber = inputArr[index];
            int sumLeft = 0;
            int sumRight = 0;
            if (index == 0) {
                sumLeft = 0;
            } else if (index > 0) {
            for (int indexLeft = index - 1; indexLeft >= 0 ; indexLeft--) {
                int leftNumber = inputArr[indexLeft];
                sumLeft += leftNumber;
            }
            }
            if (index == inputArr.length - 1) {
                sumRight = 0;
            } else if (index < inputArr.length - 1) {
                for (int indexRight = index + 1; indexRight <= inputArr.length - 1; indexRight++) {
                    int rightNumber = inputArr[indexRight];
                    sumRight += rightNumber;
                }

            }

            if (sumRight == sumLeft) {
                System.out.println(index);
                noIndex = false;
            }


            }
        if (noIndex) {
            System.out.println("no");
        }

        }
    }

