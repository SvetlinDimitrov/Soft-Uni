package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Integer> map = new LinkedHashMap<>();

        while(!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!map.containsKey(input)){
                map.put(input , quantity);
            }else {
                int currentQuantity = map.get(input);
                map.put(input, currentQuantity + quantity);
            }
            input = scanner.nextLine();
        }
        map.forEach((key , value) -> System.out.println(key + " -> "+value));
    }
}
