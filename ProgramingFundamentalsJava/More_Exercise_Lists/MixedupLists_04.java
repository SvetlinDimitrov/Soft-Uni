package ProgramingFundamentalsJava.More_Exercise_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MixedupLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> num2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sum = new ArrayList<>();
        List<Integer> between = new ArrayList<>();
        if (num1.size() > num2.size()) {
            sum = biggerFirstNum(num1, num2);
            int number1 = num1.get(num1.size() - 2);
            int number2 = num1.get(num1.size() - 1);
            for (int i = Math.min(number1 , number2)+1; i < Math.max(number1 , number2) ; i++) {
                for (int j = 0; j <= sum.size()-1; j++) {
                    if(sum.get(j)==i){
                        between.add(sum.get(j));

                    }
                }
            }
        } else {
            sum = biggerSecondNum(num1 , num2);
            int number1 = num2.get(0);
            int number2 = num2.get(1);
            for (int i = Math.min(number1 , number2)+1; i < Math.max(number1 , number2) ; i++) {
                for (int j = 0; j <= sum.size()-1; j++) {
                    if(sum.get(j)==i){
                        between.add(sum.get(j));

                    }
                }
            }
        }
        for (Integer num : between){
            System.out.printf("%d ",num);
        }
    }

    public static List<Integer> biggerFirstNum (List<Integer> biggerN1, List<Integer> lowerN2) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i <= lowerN2.size() - 1; i++) {
            sum.add(biggerN1.get(i));
            sum.add(lowerN2.get(lowerN2.size() - i - 1));
        }
        return sum;
    }
    public static List<Integer> biggerSecondNum (List<Integer> lowerN1, List<Integer> biggerN2) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i <= lowerN1.size() - 1; i++) {
            sum.add(lowerN1.get(i));
            sum.add(biggerN2.get(biggerN2.size() - i - 1));
        }
        return sum;
    }
}
