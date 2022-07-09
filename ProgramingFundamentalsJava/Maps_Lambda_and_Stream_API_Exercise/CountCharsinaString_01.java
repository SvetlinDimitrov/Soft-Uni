package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsinaString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split("\\s+");
        Map< Character , Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < stringArr.length; i++) {
            char [] charArray = stringArr[i].toCharArray();

            for (int j = 0; j < charArray.length ; j++) {
                if (!map.containsKey(charArray[j])) {
                    map.put(charArray[j], 1);
                } else {
                    int mapValue = map.get(charArray[j]);
                    map.put(charArray[j], mapValue + 1);
                }
            }
        }
        map.forEach((Key , Value) -> System.out.println(Key + " -> " + Value));
    }
}
