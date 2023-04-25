package Exercise07_AssociativeArrays;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] course = input.split(" : ");

            if (!courses.containsKey(course[0])) {
                courses.put(course[0], new ArrayList<>());
            }

            courses.get(course[0]).add(course[1]);

            input = scanner.nextLine();
        }
        courses.entrySet()
                .forEach(entry -> {System.out.println(entry.getKey() + ": " + entry.getValue().size());
                entry.getValue().forEach(name -> System.out.println("-- " + name));
                });
    }
}
