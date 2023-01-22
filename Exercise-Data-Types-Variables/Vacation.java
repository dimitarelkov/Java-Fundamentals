package Excercise01;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.00;

        switch (day) {
            case "Friday":
                if (groupType.equals("Students")) {
                    price = 8.45;
                    if (groupNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 10.90;
                    if (groupNumber >= 100) {
                        groupNumber -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 15;
                    if (groupNumber >= 10 && groupNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    price = 9.80;
                    if (groupNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 15.60;
                    if (groupNumber >= 100) {
                        groupNumber -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 20;
                    if (groupNumber >= 10 && groupNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    price = 10.46;
                    if (groupNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 16;
                    if (groupNumber >= 100) {
                        groupNumber -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 22.50;
                    if (groupNumber >= 10 && groupNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
        }
        double totalPrice = groupNumber * price;
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
