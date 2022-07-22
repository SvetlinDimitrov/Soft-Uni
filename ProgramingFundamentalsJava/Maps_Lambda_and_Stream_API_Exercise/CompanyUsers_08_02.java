package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , ArrayList<String> > map = new LinkedHashMap<>();

        while(!input.equals("End")){
            String name = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            if(!map.containsKey(name)){
                map.put(name, new ArrayList<>());
                map.get(name).add(id);
            }else if (map.containsKey(name) && !map.get(name).contains(id)){
                map.get(name).add(id);
            }

            input = scanner.nextLine();
        }
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            System.out.printf("%s%n",entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }
    }
}
