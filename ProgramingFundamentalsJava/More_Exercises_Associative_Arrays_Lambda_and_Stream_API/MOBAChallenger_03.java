package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{player} -> {position} -> {skill}"
        String input = scanner.nextLine();
        Map<String , Map <String , Integer>> map = new TreeMap<>();

        while(!input.equals("Season end")){
            String player = input.split(" -> ")[0];
            String position = input.split(" -> ")[1];
            int skill = Integer.parseInt(input.split(" -> ")[2]);
            if(!map.containsKey(player)){

            }

            input = scanner.nextLine();
        }
    }
}
