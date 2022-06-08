package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        halfTriangle(n);
        lastPeaceTriangle(n);
    }
    public static void halfTriangle(int n){

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
    public static void lastPeaceTriangle ( int n){
        for (int i = n-1; i >0 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.printf("%d " , j);
            }
            System.out.println();
        }
    }
}
