package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Scanner;

public class ReverseanArrayofStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lettersArray = scanner.nextLine().split(" ");
        for (int i = 1; i <= lettersArray.length/2; i++) {
            String saveLetter = lettersArray [i - 1];
            lettersArray [i - 1] = lettersArray[lettersArray.length - i];
            lettersArray[lettersArray.length - i] = saveLetter;
        }
        System.out.println(String.join(" ", lettersArray));
    }
}
