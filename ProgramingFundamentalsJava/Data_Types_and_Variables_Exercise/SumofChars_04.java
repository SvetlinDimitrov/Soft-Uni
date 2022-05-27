package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class SumofChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <=times ; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += letter;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
