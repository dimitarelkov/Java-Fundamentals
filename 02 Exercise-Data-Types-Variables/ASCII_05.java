package Excercise02;

import java.util.Scanner;

public class ASCII_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startLetter = Integer.parseInt(scanner.nextLine());
        int lastLetter = Integer.parseInt(scanner.nextLine());


        for (int letter = startLetter; letter <= lastLetter ; letter++) {

            char charLetter = (char) letter;

            System.out.print(charLetter + " ");
        }
    }
}
