package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class RecursiveDrawing_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Drawing(times);
    }
    public static void Drawing (int n ){
        if(n == 0){
            return;
        }
        for (int i = 1; i <=n ; i++) {
            System.out.printf("*");
        }
        System.out.println();

        Drawing(n-1);

        for (int i = 1; i <=n ; i++) {
            System.out.printf("#");
        }
        System.out.println();
    }
}
