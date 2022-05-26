package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter1 = scanner.nextLine().charAt(0);
        char letter2 = scanner.nextLine().charAt(0);
        char letter3 = scanner.nextLine().charAt(0);
        String word = String.format("%c %c %c",letter3,letter2,letter1);
        System.out.println(word);
    }
}
