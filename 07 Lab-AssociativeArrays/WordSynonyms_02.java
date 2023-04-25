package Lab07_AssociativeArrays;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> text = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            text.putIfAbsent(word, new ArrayList<>());
            text.get(word).add(synonym);


            }
        for (Map.Entry<String, List<String>> entry : text.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

        }
    }

