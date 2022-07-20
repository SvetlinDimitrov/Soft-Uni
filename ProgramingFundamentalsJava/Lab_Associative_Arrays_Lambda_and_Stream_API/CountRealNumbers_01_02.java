package ProgramingFundamentalsJava.Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double , Integer> map = new TreeMap<>() ;

        for (Double num : numbers){
            if(!map.containsKey(num)){
                map.put(num , 1);
            }else{
                int currentNum = map.get(num);
                map.put(num , currentNum +1);
            }
        }
        for(Map.Entry<Double , Integer> entry : map.entrySet()){
            System.out.printf("%.0f -> %d%n" , entry.getKey() , entry.getValue());
        }
    }
}
