package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while(true){
            if (n % 2==0){
                System.out.printf("The number is: %d",Math.abs(n));
                break;
            }else{
                System.out.println("Please write an even number.");
                n = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
