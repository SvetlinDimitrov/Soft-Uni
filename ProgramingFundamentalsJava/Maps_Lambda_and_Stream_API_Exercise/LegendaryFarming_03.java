package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mainMap = new LinkedHashMap<>();
        mainMap.put("shards", 0);
        mainMap.put("fragments", 0);
        mainMap.put("motes", 0);
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        int count = 0;
        boolean out = false;

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = mainMap.get(material);
                    mainMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentQuantity = junkMap.get(material);
                        junkMap.put(material, currentQuantity + quantity);
                    }
                }
                if (mainMap.containsKey("shards")) {
                    if (mainMap.get("shards") >= 250) {
                        mainMap.put("shards", mainMap.get("shards") - 250);
                        System.out.println("Shadowmourne obtained!");
                        out = true;
                        break;
                    }
                }
                if (mainMap.containsKey("fragments")) {
                    if (mainMap.get("fragments") >= 250) {
                        mainMap.put("fragments", mainMap.get("fragments") - 250);
                        System.out.println("Valanyr obtained!");
                        out = true;
                        break;
                    }
                }
                if (mainMap.containsKey("motes")) {
                    if (mainMap.get("motes") >= 250) {
                        mainMap.put("motes", mainMap.get("motes") - 250);
                        System.out.println("Dragonwrath obtained!");
                        out = true;
                        break;
                    }
                }
            }
            if (out) {
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : mainMap.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }
}
