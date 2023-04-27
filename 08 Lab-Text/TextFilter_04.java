package Lab08_Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bannedWords = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            text = text.replace(bannedWord, repeat("*", bannedWord.length()));
        }
        System.out.println(text);

    }
    public static String repeat (String symbol, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += symbol;
        }
        return result;
    }
}
