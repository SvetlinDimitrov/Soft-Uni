package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import javax.swing.*;
import java.util.*;

public class Ranking_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPass = scanner.nextLine();
        Map<String , String> mapPass = new HashMap<>();

        while(!inputPass.equals("end of contests")){
            String contest = inputPass.split(":")[0];
            String passContest = inputPass.split(":")[1];
            if(!mapPass.containsKey(contest)){
                mapPass.put(contest , passContest);
            }
            inputPass = scanner.nextLine();
        }

        Map<String , Map<String , Integer>> mainMap = new TreeMap<>();
        String input2 = scanner.nextLine();

        while(!input2.equals("end of submissions")){
            //{contest}=>{password}=>{username}=>{points}
            String contest = input2.split("=>")[0];
            String password = input2.split("=>")[1];
            String username = input2.split("=>")[2];
            int points = Integer.parseInt(input2.split("=>")[3]);
            if(mapPass.containsKey(contest) && mapPass.get(contest).equals(password)){
                if(!mainMap.containsKey(username)){
                    mainMap.put(username , new TreeMap<>());
                    mainMap.get(username).put(contest , points);
                }else{
                    if(!mainMap.get(username).containsKey(contest)){
                        mainMap.get(username).put(contest , points);
                    }else{
                        if(mainMap.get(username).get(contest) < points){
                            mainMap.get(username).put(contest , points);
                        }
                    }
                }
            }
            input2= scanner.nextLine();
        }

        Map<String , Map<Integer , String>> printMap = new TreeMap<>();
        for (Map.Entry<String , Map <String , Integer>> mainEntry : mainMap.entrySet()){
            printMap.put(mainEntry.getKey() , new TreeMap<>(Comparator.reverseOrder()));
            for (Map.Entry<String , Integer> entry : mainEntry.getValue().entrySet()){
                printMap.get(mainEntry.getKey()).put(entry.getValue() , entry.getKey());
            }
        }
        int sum = Integer.MIN_VALUE;
        String name ="";
        for (Map.Entry<String , Map <Integer , String>> mainEntry : printMap.entrySet()) {
            int count = 0;
            for (Map.Entry<Integer , String> entry : mainEntry.getValue().entrySet()){
               count+=entry.getKey();
               if(count>sum){
                   sum = count;
                   name = mainEntry.getKey();
               }
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n",name,sum);
        System.out.println("Ranking:");
        for (Map.Entry<String , Map <Integer , String>> mainEntry : printMap.entrySet()){
            System.out.printf("%s%n",mainEntry.getKey());
            for (Map.Entry<Integer , String> entry : mainEntry.getValue().entrySet()){
                System.out.printf("#  %s -> %d%n",entry.getValue(),entry.getKey());
            }
        }
    }
}
