package ProgramingFundamentalsJava.More_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] cats = new int [n];
        cats[0] = 1;
        cats [1]=cats [0];
        for (int i = 2; i <=n-1 ; i++) {
                   cats[i]= cats[i-2] + cats[i-1];
        }
        System.out.println(cats[n-1]);
    }
}
