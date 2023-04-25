package Exercise07_AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> product = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        int totalQuantity = 0;
        while (!product.get(0).equals("buy")) {
            String item = product.get(0);
            double price = Double.parseDouble(product.get(1));
            int quantity = Integer.parseInt(product.get(2));

            productQuantity.putIfAbsent(item, 0);
            productQuantity.put(item, productQuantity.get(item) + quantity);

            productPrice.put(item, price);

            product = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());

        }

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            double finalSum = productQuantity.get(entry.getKey()) * productPrice.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), finalSum);
        }
    }
}
