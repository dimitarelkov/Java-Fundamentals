package Lab03_Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letters = scanner.nextLine();


        String[] lettersArr = letters.split(" ");

        for (int i = 0; i < lettersArr.length; i++) {
            String currentLetter = lettersArr[i];
            String newLetter = lettersArr[lettersArr.length-1-i];

            System.out.printf("%s ", newLetter);
        }

    }
}
