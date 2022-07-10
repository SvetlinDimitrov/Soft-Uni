package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , ArrayList<String>> map = new LinkedHashMap <>();

        while(!input.equals("end")){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            if(!map.containsKey(course)) {
                map.put(course, new ArrayList<>());
                map.get(course).add(student);
            }else{
                map.get(course).add(student);
            }
            input= scanner.nextLine();
        }
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            System.out.printf("%s: %d%n",entry.getKey() , entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }
    }
}
