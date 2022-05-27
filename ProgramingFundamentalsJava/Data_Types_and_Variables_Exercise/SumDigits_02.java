package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int singleN=0;
        for (int i = number; i >0 ; i/=10) {
            singleN = i %10;
            sum+=singleN;

        }
        System.out.println(sum);
    }
}
