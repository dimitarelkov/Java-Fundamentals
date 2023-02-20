package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String token = scanner.nextLine();

        while (!token.equals("course start")) {
//Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
//Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
//Remove:{lessonTitle} - remove the lesson, if it exists
//Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
//Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
//Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.
            String command = token.split(":")[0];
            String lesson01 = token.split(":")[1];

            switch (command) {
                case "Add":
                    if (!schedule.contains(lesson01)) {
                        schedule.add(lesson01);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(token.split(":")[2]);
                    if (!schedule.contains(lesson01)) {
                        schedule.add(index, lesson01);
                    }
                    break;
                case "Remove":
                    String exercise01 = lesson01 + "-Exercise";
                    if (schedule.contains(lesson01)) {
                        if (schedule.get(schedule.indexOf(lesson01) + 1).contains("Exercise")) {
                            schedule.remove(schedule.get(schedule.indexOf(lesson01 + 1)));
                        }
                        schedule.remove(lesson01);
                    }
                    break;
                case "Swap":
                    String lesson02 = token.split(":")[2];
                    int indexLesson01 = 0;
                    int indexLesson02 = 0;
                    if (schedule.contains(lesson02) && schedule.contains(lesson01)) {
                        indexLesson01 = schedule.indexOf(lesson01);
                        indexLesson02 = schedule.indexOf(lesson02);
                        schedule.set(indexLesson01, lesson02);
                        schedule.set(indexLesson02, lesson01);
                    }

                    exercise01 = lesson01 + "-Exercise";
                    String exercise02 = lesson02 + "-Exercise";

                    if (schedule.contains(exercise01)) {
                        schedule.remove(schedule.indexOf(exercise01));
                        schedule.add(schedule.indexOf(lesson01), exercise01);
                    }
                    if (schedule.contains(exercise02)) {
                        schedule.remove(schedule.indexOf(exercise02));
                        schedule.add(schedule.indexOf(lesson02), exercise02);
                    }

                    break;

                case "Exercise":
                    exercise01 = lesson01 + "-Exercise";
                    if (schedule.contains(lesson01)) {

                    } else {
                        schedule.add(lesson01);
                        schedule.add(exercise01);
                    }
                    break;
            }

            token = scanner.nextLine();
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(i + 1 + ". " + schedule.get(i));
        }
    }
}