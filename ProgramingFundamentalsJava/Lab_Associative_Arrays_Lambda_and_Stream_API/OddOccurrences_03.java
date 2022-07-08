package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        Map<String , ArrayList<String>> map = new LinkedHashMap<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            String mainWord = arr[i].toLowerCase();
            if(!map.containsKey(mainWord)){
                map.put(mainWord , new ArrayList<>() );
                map.get(mainWord).add(mainWord);
            }else{
                map.get(mainWord).add(mainWord);
            }
        }
            List<String> save = new ArrayList<>();
        for (Map.Entry<String , ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().size() % 2 != 0) {
                save.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", save));
    }
}
