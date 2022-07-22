package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Map<String , ArrayList<Integer>>> map = new LinkedHashMap<>();
        List<String> banStudents = new ArrayList<>();

        while(!input.equals("exam finished")){
            //"{username}-{language}-{points}"
            if(input.contains("banned")){
                //"{username}-banned".
                String name = input.split("-")[0];
                banStudents.add(name);
            }else{
                String name = input.split("-")[0];
                String lang = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                if (!map.containsKey(name)){
                    map.put(name , new LinkedHashMap<>());
                    map.get(name).put(lang ,new ArrayList<>());
                    map.get(name).get(lang).add(points);
                }else{
                    if(map.get(name).containsKey(lang)){
                        map.get(name).get(lang).add(points);
                    }else{
                        map.get(name).put(lang , new ArrayList<>());
                        map.get(name).get(lang).add(points);
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String , Map<String , ArrayList<Integer>>> entryMain : map.entrySet()){
            if(!banStudents.contains(entryMain.getKey())){
                System.out.printf("%s | %d%n",entryMain.getKey(),MaxPoints(entryMain.getValue()));
            }
        }
        System.out.println("Submissions:");
        for (Map.Entry<String , Map<String , ArrayList<Integer>>> entryMain : map.entrySet()){
            for(Map.Entry<String , ArrayList<Integer>> entry2  : entryMain.getValue().entrySet()){
                System.out.printf("%s - %d%n",entry2.getKey(),entry2.getValue().size());
            }
        }
    }

    private static int MaxPoints (Map<String,ArrayList<Integer>> map){
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String,ArrayList<Integer>> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(max<entry.getValue().get(i)){
                    max=entry.getValue().get(i);
                }
            }
        }
        return max;
    }

}
