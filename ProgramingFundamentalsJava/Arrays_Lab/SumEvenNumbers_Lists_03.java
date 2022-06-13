package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumEvenNumbers_Lists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Integer> elements = Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i <= elements.size()-1; i++) {
            if(elements.get(i)%2==0) {
                sum += elements.get(i);
            }
        }
        System.out.println(sum);
    }
}
