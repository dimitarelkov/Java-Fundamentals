package Lab08_Text;

import java.util.Scanner;

public class DigitsLettersOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char[] letters = text.toCharArray();

        StringBuilder letterText = new StringBuilder();
        StringBuilder digitText = new StringBuilder();
        StringBuilder otherText = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            char current = letters[i];
            if (Character.isLetter(current)) {
                letterText.append(current);
            } else if (Character.isDigit(current)) {
                digitText.append(current);
            } else {
                otherText.append(current);
            }
        }
        System.out.println(digitText.toString());
        System.out.println(letterText.toString());
        System.out.println(otherText.toString());
    }
}
