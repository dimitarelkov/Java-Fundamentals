package Exercise07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);


        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String [] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i <= input.length - 1; i+=2) {
                int quality = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments")
                        || material.equals("motes")) {
                    int currentQuality = materials.get(material);
                    materials.put(material, currentQuality + quality);
                } else {
                    junk.putIfAbsent(material, 0);
                    junk.put(material, junk.get(material) + quality);
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get(material) - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get(material) - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get(material) - 250);
                    isWin = true;
                    break;
                }


            }

        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
