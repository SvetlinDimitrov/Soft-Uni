package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] masive = scanner.nextLine().split("");

        Map<String , Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < masive.length; i++) {
            if(!map.containsKey(masive[i]) && !masive[i].equals(" ")){
                map.put(masive[i] , 1);
            }else {
                if (!masive[i].equals(" ")) {
                    int currentValue = map.get(masive[i]);
                    map.put(masive[i], currentValue + 1);
                }
            }
        }
        for(Map.Entry<String , Integer> cat : map.entrySet()){
            System.out.printf("%s -> %d%n",cat.getKey() , cat.getValue());
        }
    }
}
