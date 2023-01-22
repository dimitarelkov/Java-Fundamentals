package Excercise01;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();

        double sumMoney = 0.0;

        while (!money.equals("Start")) {
            double coin = Double.parseDouble(money);
            sumMoney += coin;
            if (!((coin == 0.1) || (coin == 0.2) || (coin == 0.5) || (coin == 1.00) || (coin == 2.00))) {
                System.out.printf("Cannot accept %.2f%n", coin);
                sumMoney -= coin;
            }
            money = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;
        boolean invalidProduct = false;
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    totalPrice += price;
                    break;
                case "Water":
                    price = 0.7;
                    totalPrice += price;
                    break;
                case "Crisps":
                    price = 1.5;
                    totalPrice += price;
                    break;
                case "Soda":
                    price = 0.8;
                    totalPrice += price;
                    break;
                case "Coke":
                    price = 1.0;
                    totalPrice += price;
                    break;
                default:
                    price = 0;
                    totalPrice += price;
                    System.out.println("Invalid product");
                    invalidProduct = true;
            }

            if (totalPrice > sumMoney) {
                System.out.println("Sorry, not enough money");
                totalPrice -= price;
            } else if (invalidProduct) {
                totalPrice -= price;
            } else {
                System.out.printf("Purchased %s%n", product);
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumMoney - totalPrice);

    }
}
