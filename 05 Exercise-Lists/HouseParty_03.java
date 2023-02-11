package Exercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String guestAdd = input.split(" ")[0];
            if (input.contains("is going!")) {

                if (!guests.contains(guestAdd)) {
                    guests.add(guestAdd);
                } else {
                    System.out.println(guestAdd + " is already in the list!");
                }

            } else if (input.contains("is not going!")) {
                if (guests.contains(guestAdd)) {
                    guests.remove(guestAdd);
                } else {
                    System.out.println(guestAdd + " is not in the list!");
                }

            }
        }

        for (String item:guests) {
            System.out.println(item + " ");
        }

    }
}
