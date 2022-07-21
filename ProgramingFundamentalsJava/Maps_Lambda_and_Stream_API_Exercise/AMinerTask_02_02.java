package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String , Integer> map = new LinkedHashMap<>();

        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!map.containsKey(resource)){
                map.put(resource , quantity);
            }else{
                int currentNum = map.get(resource);
                map.put(resource , currentNum + quantity);
            }

            resource = scanner.nextLine();
        }
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.printf("%s -> %d%n",entry.getKey() , entry.getValue());
        }

    }
}
