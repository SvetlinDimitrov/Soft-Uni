package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class SumofOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count =0 ;
        int sum = 0;

        for (int i = 1; i <Integer.MAX_VALUE ; i++) {

            if(i%2!=0){
                System.out.println(i);
                count++;
                sum+=i;
                if(count==n){
                    break;
                }
            }

        }
        System.out.printf("Sum: %d",sum);
    }
}
