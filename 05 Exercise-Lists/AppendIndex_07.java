package Exercise05;

import java.util.*;
import java.util.stream.Collectors;

public class AppendIndex_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> textList = Arrays.stream(text.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(textList);

        System.out.println(textList.toString().replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("  "," ")
                .replaceAll("\\s+", " "));

    }
}
