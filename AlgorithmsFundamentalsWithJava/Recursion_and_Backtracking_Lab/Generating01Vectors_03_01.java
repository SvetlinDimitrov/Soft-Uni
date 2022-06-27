package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class Generating01Vectors_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int [] num = new int[number];
        allNum(num , 0);
    }
    public static void allNum ( int [] num , int index) {
        if ( index >= num.length ){
            for (int i = 0; i <= num.length-1; i++) {
                System.out.printf("%d",num[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <= 1; i++) {
            num[index] = i;
            allNum(num , index+1);
        }

    }
}
