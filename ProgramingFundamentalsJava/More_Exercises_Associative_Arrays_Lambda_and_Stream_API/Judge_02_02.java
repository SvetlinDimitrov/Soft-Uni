package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class Judge_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{username} -> {contest} -> {points}"
        String input = scanner.nextLine();
        Map<String , Map<String , Integer>> mainMap = new LinkedHashMap<>();

        while(!input.equals("no more time")){
            String username = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int points = Integer.parseInt(input.split(" -> ")[2]);
            if(!mainMap.containsKey(contest)){
                mainMap.put(contest , new HashMap<>());
                mainMap.get(contest).put(username , points);
            }else{
                if(!mainMap.get(contest).containsKey(username)){
                    mainMap.get(contest).put(username , points);
                }else{
                    if(mainMap.get(contest).get(username) < points){
                        mainMap.get(contest).put(username , points);
                    }
                }
            }
            input= scanner.nextLine();
        }
        Map<String , Map<Integer , ArrayList<String>>> printMap = new LinkedHashMap<>();

        for (Map.Entry<String , Map<String , Integer>> entryMain : mainMap.entrySet()){
            printMap.put(entryMain.getKey() , new TreeMap<>(Comparator.reverseOrder()));
            for(Map.Entry<String , Integer> entry : entryMain.getValue().entrySet()){
                if(!printMap.get(entryMain.getKey()).containsKey(entry.getValue())){
                    printMap.get(entryMain.getKey()).put(entry.getValue(), new ArrayList<>());
                    printMap.get(entryMain.getKey()).get(entry.getValue()).add(entry.getKey());
                }else{
                    printMap.get(entryMain.getKey()).get(entry.getValue()).add(entry.getKey());
                }
            }
        }

        for (Map.Entry<String , Map<Integer , ArrayList<String>>> entryMain : printMap.entrySet()){
            System.out.printf("%s: %d participants%n",entryMain.getKey() , SzieYes(entryMain.getValue()));
            int count =1;
            for(Map.Entry<Integer , ArrayList<String>> entry : entryMain.getValue().entrySet()){
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("%d. %s <::> %d%n",count,entry.getValue().get(i),entry.getKey());
                    count++;
                }
            }
        }
        System.out.println("Individual standings:");

        Map<String , Integer> print2 = new HashMap<>();

            for (Map.Entry<String , Map<String  , Integer>> entryMain : mainMap.entrySet()){
            for(Map.Entry<String , Integer> entry : entryMain.getValue().entrySet()){
                if(!print2.containsKey(entry.getKey())){
                    print2.put(entry.getKey(),entry.getValue());
                }else{
                    int currentNum = print2.get(entry.getKey());
                    print2.put(entry.getKey(), currentNum+entry.getValue());
                }
            }
        }
        Map<Integer , String> print3 = new TreeMap<>(Comparator.reverseOrder());
        for(Map.Entry<String , Integer> entry : print2.entrySet()){
            print3.put(entry.getValue(),entry.getKey());
        }

        int num = 1;
        for(Map.Entry<Integer , String> entry : print3.entrySet()){

            System.out.printf("%d. %s -> %d%n",num,entry.getValue(),entry.getKey());
            num++;
        }
    }

    private static int SzieYes(Map<Integer, ArrayList<String>> value) {
        int num = 0;
        for(Map.Entry<Integer, ArrayList<String>> entry : value.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                num++;
            }
        }
        return num;
    }
}
