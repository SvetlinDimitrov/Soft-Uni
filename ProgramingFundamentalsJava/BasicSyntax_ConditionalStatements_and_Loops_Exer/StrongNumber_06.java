package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int lastN = 0;
        int sumFact = 0;

        for (int i = N; i >0 ; i=i/10) {
            lastN = i %10;
            int fact=1;

            for (int j = lastN; j > 0 ; j--) {
                fact*=j;

            }
            sumFact+=fact;
        }
        if (N == sumFact){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
