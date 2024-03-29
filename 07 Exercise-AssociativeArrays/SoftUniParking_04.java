package Exercise07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "register":
                    if (registeredUsers.containsKey(command[1])) {
                        System.out.printf("ERROR: already registered with plate number %s%n", command[2]);
                    } else {
                        registeredUsers.put(command[1], command[2]);
                        System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                    }
                    break;
                case "unregister":
                    if (registeredUsers.containsKey(command[1])) {
                        System.out.printf("%s unregistered successfully%n", command[1]);
                        registeredUsers.remove(command[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", command[1]);
                    }
                   break;
            }

        }
        registeredUsers.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
