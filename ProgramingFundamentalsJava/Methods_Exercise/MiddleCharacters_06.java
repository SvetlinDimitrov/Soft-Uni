package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(MiddleChar(word));

    }
    public static String MiddleChar (String word){
        int lengthString = word.length();
        char [] letters = new char [word.length()];

        for (int i = 0; i <= letters.length-1; i++) {
            letters[i]=word.charAt(i);
        }

        int copyLetter = lengthString /2 ;
        String finalWord = "";
        if (lengthString % 2==0){
            finalWord = String.format("%c%c",letters[copyLetter-1],letters[copyLetter]);
        }else{
            finalWord = String.format ("%c",letters[copyLetter]);
        }
        return  finalWord;
    }
}
