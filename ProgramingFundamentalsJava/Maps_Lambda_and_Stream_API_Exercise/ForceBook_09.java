package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                //"force_side | force_user":
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                if (!map.containsKey(forceSide) && !map.containsValue(forceUser)) {
                    map.put(forceSide, new ArrayList<>());
                    map.get(forceSide).add(forceUser);
                } else if (map.containsKey(forceSide) && !map.containsValue(forceUser)) {
                    map.get(forceSide).add(forceUser);
                }

            } else if (input.contains(" -> ")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];
                if (isThere(map, forceUser) && map.containsKey(forceSide)) {
                    map.forEach((key, value) -> value.remove(forceUser));
                    map.get(forceSide).add(forceUser);
                } else if (!map.containsValue(forceUser) && map.containsKey(forceSide)) {
                    map.get(forceSide).add(forceUser);
                } else if (!map.containsValue(forceUser) && !map.containsKey(forceSide)) {
                    map.put(forceSide, new ArrayList<>());
                    map.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if(entry.getValue().size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("! %s%n", entry.getValue().get(i));
                }
            }
        }
    }


    private static boolean isThere(Map<String, ArrayList<String>> map, String forceUser) {
        for (Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            for (int j = 0; j < entry.getValue().size(); j++) {
                if(forceUser.equals(entry.getValue().get(j))){
                    return true;
                }
            }
        }
        return false;
    }
}
