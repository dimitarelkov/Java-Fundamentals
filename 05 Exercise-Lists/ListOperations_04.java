package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String action = command;

            if (action.contains("Add")) {
                int addItem = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(Integer.valueOf(addItem));
            } else if (action.contains("Insert")) {
                int element = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (action.contains("Remove")) {
                int removeIndex = Integer.parseInt(command.split("\\s+")[1]);
                if (removeIndex >= 0 && removeIndex < numbers.size()) {
                    numbers.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (action.contains("Shift left")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= count; time++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }

            } else if (action.contains("Shift right")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= count ; time++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }


            command = scanner.nextLine();
        }
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
