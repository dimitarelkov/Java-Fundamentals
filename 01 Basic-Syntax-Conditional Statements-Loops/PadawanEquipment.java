package Excercise01;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //
        //· The count of students – integer in the range [0…100].
        //
        //· The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //
        //· The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //
        //· The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totalStudents = Math.ceil(students * 1.1);
        double totalLightsabers = priceLightsaber * totalStudents;
        double totalBelt = priceBelt * (students - Math.floor(students/6.0));
        double totalRobe = priceRobe * students;

        double expenses = totalLightsabers + totalBelt + totalRobe;

        if (expenses > budget) {
            System.out.printf("George Lucas will need %.2flv more.", expenses - budget);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", expenses);
        }


    }
}
