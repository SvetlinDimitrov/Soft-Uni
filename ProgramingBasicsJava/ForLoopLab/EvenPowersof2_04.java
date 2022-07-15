package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class EvenPowersof2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0 ;
        for ( int i = 1 ; i <=n ; i++) {
             if ( i % 2 == 0) {
                 System.out.printf("%.0f%n", Math.pow(2, i));
             }
             if ( i == 1) {
                 System.out.printf("%d%n", 1);
             }
        }
    }
}
