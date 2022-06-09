package ProgramingFundamentalsJava.More_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence_04 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int []  numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] index = new int [numbers.length];
        int [] saveMasive = new int [numbers.length];
        int max = Integer.MIN_VALUE;



        for (int i = 0; i < numbers.length; i++) {
            index [i] = 1;

            for (int j = 0; j < i ; j++) {
                if((numbers[i] > numbers[j]) && (index[j] +1  > index[i])){
                    index[i] = index[j] + 1;


                }

            }

        }

        System.out.println();
    }
}
