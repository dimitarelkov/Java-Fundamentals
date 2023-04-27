package Lab08_Text;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String reversed = "";
            for (int i = command.length() - 1; i >= 0; i--) {
                reversed += command.charAt(i);


            }
            System.out.println(command + " = " + reversed);
            command = scanner.nextLine();
        }
    }
}
