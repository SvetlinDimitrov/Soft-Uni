package ProgramingFundamentalsJava.More_Exercises_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int [number];
        Arrays.fill(numbers , 0);
        System.out.println(Tribonacci(numbers));
    }
    public static String Tribonacci (int [] num) {
        String tribo = "";

        for (int i = 0; i <= num.length - 1; i++) {
            if (i == 0) {
                num[i] = 1;
            } else if (i == 1) {
                num[i] = num[i - 1];
            } else if (i == 2) {
                num[i] = num[i - 1] + num[i - 2];
            } else {
                num[i] = num[i - 1] + num[i - 2] + num[i - 3];
            }
            tribo += String.format("%d ", num[i]);
        }
        return  tribo;
    }
}
