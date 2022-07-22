package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Map<String , ArrayList<Double>> map = new LinkedHashMap<>();

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
        for (Map.Entry<String , ArrayList<Double>> entry : map.entrySet()) {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            if (sum / entry.getValue().size() >= 4.50) {
                System.out.printf("%s -> ", entry.getKey());
                System.out.printf("%.2f%n", sum / entry.getValue().size());
            }
        }
    }
}
