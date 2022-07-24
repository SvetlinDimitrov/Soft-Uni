package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class TestSortingMapByValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> unSorted = new HashMap<>();
        unSorted.put("tohso" , 1);
        unSorted.put("tohso1" , 10);
        unSorted.put("tohso2" , 0);
        unSorted.put("tohso3" , 2);
        System.out.println(unSorted.toString());

        //Първа стъпка правя си мап в който ще ги запазя
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        //Почваме
       // unSorted.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x-> sortedMap.put(x.getKey() , x.getValue()));
        unSorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println(sortedMap.toString());
    }
}
