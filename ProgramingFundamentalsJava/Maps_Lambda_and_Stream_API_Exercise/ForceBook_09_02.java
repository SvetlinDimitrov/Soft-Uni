package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ForceBook_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , ArrayList<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){

            if(input.contains(" | ")){
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];
                if(!map.containsKey(forceSide) && !CheckForceUser(map , forceUser)){
                    map.put(forceSide , new ArrayList<>());
                    map.get(forceSide).add(forceUser);
                }else if (map.containsKey(forceSide) && !CheckForceUser(map , forceUser)){
                    map.get(forceSide).add(forceUser);
                }
            }

            if(input.contains(" -> ")){
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];
                if(!CheckForceUser(map, forceUser) && !map.containsKey(forceSide) ) {
                    map.put(forceSide, new ArrayList<>());
                    map.get(forceSide).add(forceUser);
                }else if(!CheckForceUser(map, forceUser) && map.containsKey(forceSide)) {
                    map.get(forceSide).add(forceUser);
                }else if (CheckForceUser(map, forceUser) && map.containsKey(forceSide)){
                    String currentForceSide = CheckForceSide(map , forceUser);
                    map.get(currentForceSide).remove(forceUser);
                    map.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            if(entry.getValue().size()>0){
                System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("! %s%n",entry.getValue().get(i));
                }
            }
        }
    }

    private static String CheckForceSide(Map<String, ArrayList<String>> map, String forceUser) {
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(forceUser.equals(entry.getValue().get(i))){
                   return entry.getKey();
                }
            }
        }
        return "";

    }

    private static boolean CheckForceUser(Map<String, ArrayList<String>> map, String forceUser) {
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(forceUser.equals(entry.getValue().get(i))){
                    return true;
                }
            }
        }
        return false;
    }

}
