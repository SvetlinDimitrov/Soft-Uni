package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        Map <String , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i] , 1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey() , entry.getValue());
        }

    }
}
