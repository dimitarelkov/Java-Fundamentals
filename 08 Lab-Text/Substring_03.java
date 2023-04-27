package Lab08_Text;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.indexOf(key) != -1) {

            text = text.replace(key, "");

        }
        System.out.println(text);



    }
}
