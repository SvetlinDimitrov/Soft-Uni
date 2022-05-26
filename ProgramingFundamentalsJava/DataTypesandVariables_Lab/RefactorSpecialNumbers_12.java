package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean toe = false;
        for (int i = 1; i <= times; i++) {
            int currentN = i;
            while (currentN > 0) {
                sum += currentN % 10;
                currentN = currentN / 10;
            }
            toe = (sum == 5) || (sum == 7) || (sum == 11);
            if(toe) {
                System.out.printf("%d -> True%n", i);
            }else{
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;


        }
    }
}
