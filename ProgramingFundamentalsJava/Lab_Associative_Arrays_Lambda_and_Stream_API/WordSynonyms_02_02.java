package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < times; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            if(!map.containsKey(key)){
               map.put(key , new ArrayList<>());
               map.get(key).add(value);
            }else{
                map.get(key).add(value);
            }
        }
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            System.out.printf("%s - ",entry.getKey());
            System.out.println(String.join(", " , entry.getValue()));
            }
        }
    }

