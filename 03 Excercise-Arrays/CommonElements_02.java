package Excercise03_Arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firstArray = firstLine.split(" ");
        String[] secondArray = secondLine.split(" ");

        for (String secondElement :
             secondArray) {
            for (String firstElement :
                 firstArray) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(secondElement + " ");
                    break;
                }
            }
        }
    }
}
