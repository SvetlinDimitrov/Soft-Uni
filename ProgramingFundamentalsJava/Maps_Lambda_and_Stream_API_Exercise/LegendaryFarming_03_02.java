package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> mainMap = new LinkedHashMap<>();
        mainMap.put("shards" , 0);
        mainMap.put("fragments" , 0);
        mainMap.put("motes" , 0);
        String [] input = scanner.nextLine().split(" ");
        Map<String , Integer> secondMap = new LinkedHashMap<>();
        boolean out = false;


        while(isValide(mainMap)){

            for (int i = 0; i < input.length; i+=2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i+1].toLowerCase();

                if(mainMap.containsKey(material)){
                    int currentNum = mainMap.get(material);
                    mainMap.put(material , currentNum+quantity);
                    if(mainMap.get(material) >= 250){
                        int current = mainMap.get(material);
                        mainMap.put(material , current-250 );
                        if(material.equals("shards")){
                            System.out.println("Shadowmourne obtained!");
                        }else if (material.equals("fragments")){
                            System.out.println("Valanyr obtained!");
                        }else if ( material.equals("motes")){
                            System.out.println("Dragonwrath obtained!");
                        }
                        out=true;
                        break;
                    }
                }else{
                    if(!secondMap.containsKey(material)){
                        secondMap.put(material , quantity);
                    }else{
                        int currentNum = secondMap.get(material);
                        secondMap.put(material , currentNum+quantity);
                    }
                }

            }
            if(out){
                break;
            }
            input = scanner.nextLine().split(" ");

        }
        for (Map.Entry<String , Integer> mainEntry : mainMap.entrySet()){
            System.out.printf("%s: %d%n",mainEntry.getKey() , mainEntry.getValue());
        }
        for (Map.Entry<String , Integer> mainEntry : secondMap.entrySet()){
            System.out.printf("%s: %d%n",mainEntry.getKey() , mainEntry.getValue());
        }
    }

    private static boolean isValide(Map<String, Integer> mainMap) {
        for(Map.Entry<String , Integer> entry : mainMap.entrySet()){
            if(entry.getValue() >= 250){
                return false;
            }
        }
        return true;
    }

}
