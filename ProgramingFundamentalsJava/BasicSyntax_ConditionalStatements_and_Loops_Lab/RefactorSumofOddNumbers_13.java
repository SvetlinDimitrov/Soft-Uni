package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class RefactorSumofOddNumbers_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= n-1; i++) {
            System.out.print(2 * i + 1);
            System.out.println();
            sum += 2 * i +1;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
