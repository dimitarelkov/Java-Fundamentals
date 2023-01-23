package Excercise01;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetCost = (lostGamesCount / 2) * headsetPrice;
        double miceCost = (lostGamesCount / 3) * mousePrice;
        double keyboardCost = (lostGamesCount / 6) * keyboardPrice;
        double displayCost = (lostGamesCount / 12) * displayPrice;
        double expenses = headsetCost + miceCost + keyboardCost + displayCost;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
