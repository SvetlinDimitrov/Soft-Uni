package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class Judge_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{username} -> {contest} -> {points}"
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String username = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int points = Integer.parseInt(input.split(" -> ")[2]);
            if (!map.containsKey(contest)) {
                map.put(contest, new LinkedHashMap<>());
                map.get(contest).put(username, points);
            } else {
                if (!map.get(contest).containsKey(username)) {
                    map.get(contest).put(username, points);
                } else {
                    if (map.get(contest).get(username) < points) {
                        map.get(contest).put(username, points);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for(Map.Entry<String , Map<String , Integer>>entry : map.entrySet()){
            System.out.printf("%s: %d participants%n",entry.getKey() , entry.getValue().size());
            int count = 0;
            for (Map.Entry<String , Integer> entry1 : entry.getValue().entrySet()){

                count++;
                System.out.printf("%d. %s <::> %d%n",count,entry1.getKey(),entry1.getValue());

            }
        }
        Map <String , Integer> map1 = new LinkedHashMap<>();
        for(Map.Entry<String , Map<String , Integer>>entry : map.entrySet()){
            for (Map.Entry<String , Integer> entry1 : entry.getValue().entrySet()){
                if(!map1.containsKey(entry1.getKey())){
                    map1.put(entry1.getKey(), entry1.getValue());
                }else {
                    if(map1.get(entry1.getKey()) < entry1.getValue()){
                        map1.put(entry1.getKey(), entry1.getValue());
                    }
                }
            }
        }
        System.out.println("Individual standings:");

        int count =0 ;
        map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> map1.put(x.getKey(), x.getValue()));
        for(Map.Entry <String , Integer> entry : map1.entrySet()){
            count++;
            System.out.printf("%d. %s -> %d%n",count,entry.getKey(),entry.getValue());
        }
    }
}
