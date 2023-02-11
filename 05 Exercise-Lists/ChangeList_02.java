package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String action = command.split(" ")[0];

            if (action.equals("Delete")) {
                int deleteItem = Integer.parseInt(command.split(" ")[1]);
                numbers.removeIf(e -> e == deleteItem);
            } else if (action.equals("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, element);
            }


            command = scanner.nextLine();
        }

        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
