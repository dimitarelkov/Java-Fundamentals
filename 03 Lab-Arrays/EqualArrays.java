package Lab03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr01 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numberArr02 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = 0;
        boolean arraysAreIdentical = true;
        int sum = 0;

        int index = 0;

        if (numberArr01.length >= numberArr02.length) {
            n = numberArr01.length;
        } else {
            n = numberArr02.length;
        }

        for (int i = 0; i < n; i++) {


            if (numberArr01[i] != numberArr02[i]) {
                arraysAreIdentical = false;
                index = i;
                break;
            }

            sum = sum + numberArr01[i] + numberArr02[i];

        }

        if (arraysAreIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum / 2);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}
