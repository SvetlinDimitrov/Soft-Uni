package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , ArrayList<Double>> map = new LinkedHashMap <>();
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(!map.containsKey(name)){
                map.put(name , new ArrayList<>());
                map.get(name).add(grade);
            }else{
                map.get(name).add(grade);
            }

        }


        for (Map.Entry<String , ArrayList<Double>> entry : map.entrySet()){
            double middleGrade = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                middleGrade+=entry.getValue().get(i);
            }
            middleGrade = middleGrade/entry.getValue().size();
            if(middleGrade >=4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey() ,middleGrade );
            }

        }
    }
}
