package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class GeneratingVectors_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] numArray = new int [n];
        Generator(numArray , 0);


    }
    public static void Generator (int [] num , int index) {
        if (index > num.length-1) {
            for (Integer numuber : num) {
                System.out.printf("%d", numuber);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <= 1; i++) {
            num[index] = i;
            Generator(num, index+1);
        }
    }
}
