package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class TriangleofNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
