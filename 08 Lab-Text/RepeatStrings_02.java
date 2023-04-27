package Lab08_Text;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        String result = "";

        for (int i = 0; i < text.length; i++) {
            String currentWord = text[i];
            String newWord = "";
            for (int j = 0; j < currentWord.length(); j++) {
                newWord += currentWord;
            }
            result += newWord;

        }
        System.out.println(result);
    }
}