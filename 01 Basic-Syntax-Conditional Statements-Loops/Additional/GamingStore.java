package Excercise01.Additional;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        String buyingGames = scanner.nextLine();

        double priceGame = 0.00;
        double sum = 0.0;
        boolean correctGameName = false;
        while (!buyingGames.equals("Game Time")) {

            if (buyingGames.equals("OutFall 4")) {
                priceGame = 39.99;
                correctGameName = true;
            } else if (buyingGames.equals("CS: OG")) {
                priceGame = 15.99;
                correctGameName = true;
            } else if (buyingGames.equals("Zplinter Zell")) {
                priceGame = 19.99;
                correctGameName = true;
            } else if (buyingGames.equals("Honored 2")) {
                priceGame = 59.99;
                correctGameName = true;
            } else if (buyingGames.equals("RoverWatch")) {
                priceGame = 29.99;
                correctGameName = true;
            } else if (buyingGames.equals("RoverWatch Origins Edition")) {
                priceGame = 39.99;
                correctGameName = true;
            } else {
                System.out.println("Not Found");
                correctGameName = false;
            }




            currentBalance = currentBalance - priceGame;
            sum += priceGame;

            if (currentBalance == 0 && correctGameName) {
                System.out.printf("Bought %s%n", buyingGames);
                System.out.println("Out of money!");
                break;
            } else if (currentBalance < 0) {
                System.out.println("Too Expensive");
                currentBalance = currentBalance + priceGame;
                sum -= priceGame;
            } else if (currentBalance >= 0 && correctGameName) {
                System.out.printf("Bought %s%n", buyingGames);
            }
            buyingGames = scanner.nextLine();


        }
        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, currentBalance);
        }
    }
}
