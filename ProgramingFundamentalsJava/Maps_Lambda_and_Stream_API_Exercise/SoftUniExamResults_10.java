package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Integer> mapPeople = new LinkedHashMap<>();
        Map<String , Integer> mapSub = new LinkedHashMap<>();

        while(!input.equals("exam finished")){
            if(!input.contains("banned")) {
                String name = input.split("-")[0];
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                if (!mapPeople.containsKey(name)) {
                    mapPeople.put(name, points);
                    if(!mapSub.containsKey(language)) {
                        mapSub.put(language, 1);
                    }else{
                        int currentPoints = mapSub.get(language);
                        mapSub.put(language, currentPoints + 1);
                    }
                } else  {
                    int currentPoints = mapSub.get(language);
                    mapSub.put(language, currentPoints + 1);
                    if (mapPeople.get(name) < points) {
                        mapPeople.put(name, points);
                    }
                }
            }else{
                String name = input.split("-")[0];
                mapPeople.remove(name);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String , Integer> entry : mapPeople.entrySet()){
            System.out.printf("%s | %d%n",entry.getKey(),entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String , Integer> entry : mapSub.entrySet()){
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        }
    }
}
