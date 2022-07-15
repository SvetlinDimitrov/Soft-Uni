package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for ( int i = 0 ; i  < word.length() ; i++){
            System.out.printf("%s%n",word.charAt(i)) ;

        }
    }
}
