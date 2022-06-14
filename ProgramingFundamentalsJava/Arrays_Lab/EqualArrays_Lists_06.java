package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EqualArrays_Lists_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> number2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int breakStop = 0;
        boolean notEqual = false;
        int sum = 0;

        for (int i = 0; i <= number.size() - 1; i++) {
            if (!number.get(i).equals(number2.get(i))) {
                breakStop = i;
                notEqual = true;
                break;
            } else {
                sum += number.get(i);
            }
        }
        if (notEqual) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", breakStop);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
