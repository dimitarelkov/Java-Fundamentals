package Excercise03_Arrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonNumber = Integer.parseInt(scanner.nextLine());

        int[] trainArr = new int[wagonNumber];

        int sum = 0;

        for (int index = 0; index < trainArr.length; index++) {
            int peoplePerWagon = Integer.parseInt(scanner.nextLine());
            sum += peoplePerWagon;
            System.out.print(peoplePerWagon + " ");




        }
        System.out.println();
        System.out.println(sum);



    }
}
