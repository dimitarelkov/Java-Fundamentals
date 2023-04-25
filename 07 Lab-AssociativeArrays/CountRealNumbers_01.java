package Lab07_AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Double :: parseDouble).toArray();

        Map<Double, Integer> num = new TreeMap<>();


        for (double number : numbers) {

            if (!num.containsKey(number)) {
                num.put(number, 1);
            } else {
                int occurrence = num.get(number);
                occurrence++;
                num.put(number, occurrence);
            }

        }

        DecimalFormat df = new DecimalFormat("#.###########");

        for (Map.Entry<Double, Integer> doubleIntegerEntry : num.entrySet()) {
            System.out.printf("%s -> %d%n", df.format(doubleIntegerEntry.getKey()), doubleIntegerEntry.getValue());
        }

    }
}
