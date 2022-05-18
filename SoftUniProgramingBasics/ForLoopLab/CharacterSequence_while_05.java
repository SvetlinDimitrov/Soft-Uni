package SoftUniProgramingBasics.ForLoopLab;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CharacterSequence_while_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordLong = word.length();
        int i = 0;
        while(wordLong > i){
            char words = word.charAt(i);
            System.out.printf("%c%n",words);
            i++;

        }
    }
}
