package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import jdk.jfr.Enabled;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Map<String , String> map = new LinkedHashMap<>();

        for (int i = 0; i < times; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            if(command.equals("register")) {
                String name = input.split(" ")[1];
                String carNumber = input.split(" ")[2];
                if(!map.containsKey(name)){
                    map.put(name , carNumber);
                    System.out.printf("%s registered %s successfully%n",name,carNumber);
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",map.get(name));
                }

            }else{
                String name = input.split(" ")[1];
                if(!map.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else{
                    map.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }

        }
        for (Map.Entry<String , String> entry : map.entrySet()){
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }
    }
}
