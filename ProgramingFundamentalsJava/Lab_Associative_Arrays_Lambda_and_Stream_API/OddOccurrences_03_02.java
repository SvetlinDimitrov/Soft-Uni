package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;


import java.util.*;

public class OddOccurrences_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase(Locale.ROOT);
            if(!map.containsKey(currentWord)){
                map.put(currentWord , 1);
            }else{
                int currentValue = map.get(currentWord);
                map.put(currentWord , currentValue+1);
            }
        }
        StringBuilder print = new StringBuilder();
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() %2 !=0){
                print.append(entry.getKey());
                print.append(", ");
            }
        }
        String printAll = print.substring(0 , print.lastIndexOf(","));
        System.out.println(printAll);
    }
}
