package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        List<Integer> bomb = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

       int bombNumber = bomb.get(0);
       int bombPower = bomb.get(1);

        int sum = 0;
        int bombIndex = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) == bombNumber) {
                bombIndex = i;
                int left = Math.max(0, bombIndex - bombPower);
                int right = Math.min(bombIndex + bombPower, numbers.size() - 1);

                numbers.subList(left, right+1).clear();
                }
            }

        numbers.remove(Integer.valueOf(bombNumber));


        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
