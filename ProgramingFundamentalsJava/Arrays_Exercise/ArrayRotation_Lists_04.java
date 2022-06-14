package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayRotation_Lists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int times = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <times ; i++) {
            num.add(num.get(0));
            num.remove(0 );
        }
        for (Integer numbers : num){
            System.out.printf("%d ",numbers);
        }
    }
}
