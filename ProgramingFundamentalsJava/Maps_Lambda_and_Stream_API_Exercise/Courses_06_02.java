package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , ArrayList<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("end")){
            String course = input.split(" : ")[0];
            String name = input.split(" : ")[1];
            if(!map.containsKey(course)){
                map.put(course , new ArrayList<>());
                map.get(course).add(name);
            }else{
                map.get(course).add(name);
            }
            input = scanner.nextLine();
        }
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }

        }
    }
}
