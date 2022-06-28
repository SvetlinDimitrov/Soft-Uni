package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Scanner;

public class NChooseKCount_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(Choose(k , n));
    }

    private static int Choose(int k, int n) {
        if (k>n){
            return 0;
        }
        if(k == 0){
            return 1;
        }
        if(k == n ){
            return 1;
        }
        return Choose(k-1 , n-1) + Choose(k , n-1);
    }
}
