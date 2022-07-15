package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class CharacterSequence_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i=0 ; i<word.length() ; i ++) {
            char word1 = word.charAt(i) ;
            System.out.printf("%c%n", word1 );
        }
    }
}
