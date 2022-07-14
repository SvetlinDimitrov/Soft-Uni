package ProgramingFundamentalsJava.Text_Processing_Lab;

import java.util.Scanner;

public class DigitsLettersandOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder something = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digit.append(input.charAt(i));
            } else if (Character.isAlphabetic(input.charAt(i))) {
                letter.append(input.charAt(i));
            } else {
                something.append(input.charAt(i));
            }
        }
        System.out.println(digit.toString());
        System.out.println(letter.toString());
        System.out.println(something.toString());
    }
}
