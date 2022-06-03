package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber_07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(CondenseArrayToNumber(numbers));
    }
    public static int CondenseArrayToNumber(int[] numbers){


        for (int i = 0; i < numbers.length ; i++) {
            int [] copy = new int [numbers.length-1];

            for (int j = 0; j < numbers.length-1; j++) {
                copy[j] = numbers[j] + numbers[j+1];
            }
            numbers = copy;
        }
        return numbers[0];
    }
}
