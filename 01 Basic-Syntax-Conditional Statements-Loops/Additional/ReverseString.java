package Excercise01.Additional;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 1; i <= text.length(); i++) {
            int placeLetter = (text.length()-i);
            char currentLetter = text.charAt(placeLetter);

            System.out.print(currentLetter);
        }
    }
}
