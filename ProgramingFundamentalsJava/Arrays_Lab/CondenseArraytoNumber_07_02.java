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

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length -1; j++) {
                numbers[j] = numbers[j] + numbers[j+1];
            }

        }
        return numbers[0];
    }
}
