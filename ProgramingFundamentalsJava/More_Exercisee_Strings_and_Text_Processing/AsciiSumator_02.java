package ProgramingFundamentalsJava.More_Exercisee_Strings_and_Text_Processing;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        String word = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentPosition = word.charAt(i);
            if(currentPosition>firstLetter && currentPosition<secondLetter){
                sum+=currentPosition;
            }
        }
        System.out.println(sum);
    }
}
