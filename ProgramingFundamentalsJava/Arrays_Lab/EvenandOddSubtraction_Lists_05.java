package ProgramingFundamentalsJava.Arrays_Lab;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenandOddSubtraction_Lists_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= numbers.size()-1; i++) {
            if (numbers.get(i) %2 ==0){
                sum1+=numbers.get(i);
            }else{
                sum2+=numbers.get(i);
            }
        }
        System.out.println(sum1-sum2);

    }
}
