package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , String> mapContest = new TreeMap<>();

        while(!input.equals("end of contests")){
            String contest = input.split(":")[0];
            String pass = input.split(":")[1];
            mapContest.put(contest , pass);
            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();
        Map<String , Map<String , Integer>> map = new TreeMap<>();

        while(!input2.equals("end of submissions")){
            //"{contest}=>{password}=>{username}=>{points}"
            String contest = input2.split("=>")[0];
            String password = input2.split("=>")[1];
            String username = input2.split("=>")[2];
            Integer points = Integer.parseInt(input2.split("=>")[3]);
            if(mapContest.containsKey(contest)){
                if(mapContest.get(contest).equals(password)){
                    if(!map.containsKey(username)) {
                        map.put(username, new TreeMap<>());
                        map.get(username).put(contest, points);
                    }else{
                        if(!map.get(username).containsKey(contest)){
                            map.get(username).put(contest , points);
                        }else {
                            if (map.get(username).get(contest) < points) {
                                map.get(username).put(contest, points);
                            }
                        }
                    }
                }
            }
            input2 = scanner.nextLine();
        }
        int maxPoints = Integer.MIN_VALUE;
        String max= "";
        for (Map.Entry<String , Map<String , Integer>> entry :map.entrySet()){
            int sumPoints = 0;
            for (Map.Entry<String , Integer> entryy : entry.getValue().entrySet()){
                sumPoints+=entryy.getValue();
                if(maxPoints < sumPoints){
                    maxPoints = sumPoints;
                    max = entry.getKey();
                }

            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n",max ,maxPoints);
        System.out.println("Ranking: ");
        for (Map.Entry<String , Map<String , Integer>> entry :map.entrySet()){
            System.out.printf("%s%n",entry.getKey());
            for (Map.Entry<String , Integer> entryy : entry.getValue().entrySet()){
                System.out.printf("#  %s -> %d%n",entryy.getKey() ,entryy.getValue() );
            }
        }
    }
}
