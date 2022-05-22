package ProgramingFundamentalsJava.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n > n2 && n > n3) {
            System.out.println(n);
            if (n2 > n3) {
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 > n && n2 > n3) {
            System.out.println(n2);
            if (n > n3) {
                System.out.println(n);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n);
            }
        }
        if (n3 > n && n3 > n2) {
            System.out.println(n3);
            if (n2 > n) {
                System.out.println(n2);
                System.out.println(n);
            } else {
                System.out.println(n);
                System.out.println(n2);
            }
        }
    }
}