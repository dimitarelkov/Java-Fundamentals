package Lab03_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumEvenNumbers_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0) {
                sum += numberArr[i];
            }
                    }
        System.out.println(sum);
    }
}