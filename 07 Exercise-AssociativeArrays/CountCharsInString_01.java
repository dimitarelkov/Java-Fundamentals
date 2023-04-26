package Exercise07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        Map<Character, Integer> textMap = new LinkedHashMap<>();

        for (char symbol : text) {
            if (symbol == ' ') {
                continue;
            } else {
                textMap.putIfAbsent(symbol, 0);
            textMap.put(symbol, textMap.get(symbol) + 1);
        }
        }

        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
