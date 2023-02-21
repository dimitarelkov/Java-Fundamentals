package Lab04_Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeat(string, n));

    }
    public static String repeat(String text, int count) {
        String newText = "";
        for (int i = 0; i < count; i++) {
            newText += text;
        }
        return newText;
    }
}
