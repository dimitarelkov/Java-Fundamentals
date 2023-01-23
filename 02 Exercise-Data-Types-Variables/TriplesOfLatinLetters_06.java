package Excercise02;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()) - 1;

        for (int firstLetter = 97; firstLetter <= 97 + n; firstLetter++) {
           char charFirstLetter = (char) firstLetter;
            for (int secondLetter = 97; secondLetter <= 97 + n; secondLetter++) {
                char charSecondLetter = (char) secondLetter;
                for (int thirdLetter = 97; thirdLetter <= 97 + n; thirdLetter++) {
                    char charThirdLetter = (char) thirdLetter;
                    System.out.printf("%c%c%c%n", charFirstLetter, charSecondLetter,charThirdLetter);
                }
            }

        }

    }
}
