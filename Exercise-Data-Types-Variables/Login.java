package Excercise01;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String truePassword = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currantSymbol = username.charAt(i);

            truePassword += currantSymbol;

        }
        int countIncorrectPassword = 0;
        while (!truePassword.equals(password)) {
            countIncorrectPassword++;
            if (countIncorrectPassword == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }
        if (truePassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
