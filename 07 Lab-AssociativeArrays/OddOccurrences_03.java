package Lab07_AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Map<String, Integer> words = new LinkedHashMap<>();

        for (String word : text) {

            String item = word.toLowerCase();

            words.putIfAbsent(item, 0);
            words.put(item, words.get(item) + 1);

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ", result));
    }
}
