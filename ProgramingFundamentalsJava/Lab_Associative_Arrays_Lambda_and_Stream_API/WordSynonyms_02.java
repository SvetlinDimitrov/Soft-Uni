package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.awt.*;
import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Map<String ,ArrayList<String>> map = new LinkedHashMap<>();
        for (int i = 0; i < times; i++) {
            String mainWord = scanner.nextLine();
            String notMainWord = scanner.nextLine();
            if(!map.containsKey(mainWord)){
                map.put(mainWord , new ArrayList<>());
                map.get(mainWord).add(notMainWord);
            }else{
                map.get(mainWord).add(notMainWord);
            }

        }
        for (Map.Entry<String , ArrayList<String>> entry : map.entrySet()){
            String copy = entry.getValue().get(0);
            for (int i = 1; i < entry.getValue().size(); i++) {
                copy+=String.format(", %s",entry.getValue().get(i));
            }
            System.out.printf("%s - %s%n",entry.getKey() , copy);
        }
    }
}
