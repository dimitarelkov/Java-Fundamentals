package Lab03_Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] dayOfTheWeekArray = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };



            if (dayNumber >= 1 && dayNumber <= 7) {
                System.out.println(dayOfTheWeekArray[dayNumber-1]);
            } else {
                System.out.println("Invalid day!");
            }

    }
}
