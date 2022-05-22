package ProgramingFundamentalsJava.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reverseName = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            char letter = name.charAt(i);
            reverseName = reverseName + letter;

        }
        System.out.println(reverseName);
    }
}
