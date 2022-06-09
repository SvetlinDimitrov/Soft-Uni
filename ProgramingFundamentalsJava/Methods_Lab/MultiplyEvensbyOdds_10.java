package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensbyOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        if (n1 < 0){
           n1 = Math.abs(n1);
        }
        String numbers = String.format("%d" , n1);
        int [] arrays = Arrays.stream(numbers.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Result(arrays));

    }
    public static int Result (int [] arrays){
        int sum1 = 0;
        int sum2 =0;
        for (int i = 0; i <= arrays.length-1; i++) {
            if (arrays[i] % 2 == 0) {
                sum1 += arrays[i];
            } else {
                sum2 += arrays[i];
            }
        }
        return  sum1 * sum2;
    }

}
