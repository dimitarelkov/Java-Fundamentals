package Excercise01.Additional;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int min = 0;
        int mid = 0;

        if (x1 > x2 && x1 > x3) {
           max = x1;
        } else if (x2 > x3) {
           max = x2;
        } else {
           max = x3;
        }

        if (x1 < x2 && x1 < x3) {
            min = x1;
        } else if (x2 < x3) {
            min = x2;
        } else {
            min = x3;
        }
        if ((x3 == max && x2 == min) || (x3 == min && x2 == max)) {
           mid = x1;
        } else if (x2 == min || x2 == max) {
            mid = x3;
        } else {
            mid = x2;

        }

        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
    }
