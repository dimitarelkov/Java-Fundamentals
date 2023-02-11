package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {

            int addWagon = Integer.parseInt(command.split(" ")[1]);

                train.add(addWagon);

            } else {
                int addPassengers = Integer.parseInt(command.split(" ")[0]);

                for (int i = 0; i < train.size(); i++) {
                    int currentPassengers = train.get(i);
                    if (train.get(i) + addPassengers <= capacity) {
                        train.remove(i);
                        train.add(i, currentPassengers+addPassengers);
                        break;
                    }
                }
            }


            command = scanner.nextLine();
        }

        for (int item : train) {
            System.out.print(item + " ");
        }
    }
}
