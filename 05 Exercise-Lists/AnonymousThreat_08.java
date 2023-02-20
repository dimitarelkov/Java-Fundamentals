package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> textList = Arrays.stream(text.split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")){

            String[] commandArr = command.split(" ");
            String input = commandArr[0];

            if (input.equals("merge")) {

                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > textList.size() - 1) {
                    endIndex = textList.size() - 1;
                }

                if (startIndex >= 0 && startIndex <= textList.size() - 1 && endIndex >= 0 && endIndex <= textList.size() - 1) {

                    String mergeElement = "";

                    for (int i = startIndex; i <= endIndex; i++) {
                        mergeElement += textList.get(i);

                    }

                    for (int i = startIndex; i <= endIndex; i++) {
                        textList.remove(startIndex);
                    }

                    textList.add(startIndex, mergeElement);


                }


            } else if (input.equals("divide")) {
                int index = Integer.parseInt(commandArr[1]);
                int partition = Integer.parseInt(commandArr[2]);

                String partToDivide = textList.get(index);
                textList.remove(index);

                int partLength = partToDivide.length() / partition;
                int startIndex = 0;
                for (int i = 1; i < partition; i++) {
                   textList.add(index, partToDivide.substring(startIndex, startIndex + partLength));

                   index++;
                   startIndex += partLength;

                }
                textList.add(index, partToDivide.substring(startIndex));

            }
            command = scanner.nextLine();
        }

        System.out.print(String.join(" ", textList));
    }
}
