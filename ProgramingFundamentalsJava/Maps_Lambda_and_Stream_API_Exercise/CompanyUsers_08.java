package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , ArrayList<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("End")){
            String course = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            if(!map.containsKey(course)){
                map.put(course , new ArrayList<>());
                map.get(course).add(id);
            }else{
                if(!map.get(course).contains(id)){
                    map.get(course).add(id);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }
    }
}
