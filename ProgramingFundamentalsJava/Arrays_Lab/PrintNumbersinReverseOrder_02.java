package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbersArray = new int[n];
        for (int i = 0; i < n; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = numbersArray.length  - 1; i >= 0; i--) {
            System.out.printf("%d ",numbersArray[i]);

        }
    }
}
