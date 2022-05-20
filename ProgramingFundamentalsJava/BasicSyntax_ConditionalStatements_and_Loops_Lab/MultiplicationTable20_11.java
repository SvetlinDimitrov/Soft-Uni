package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class MultiplicationTable20_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if(times >10){
            System.out.printf("%d X %d = %d%n",n,times,n*times);
        }
        for (int i = times; i <=10 ; i++) {
            System.out.printf("%d X %d = %d%n",n,i,n*i);

        }
    }
}
