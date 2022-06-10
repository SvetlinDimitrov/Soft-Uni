package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while(!word.equals("END")){
            System.out.println(Palindrome(word));
            word = scanner.nextLine();
        }
    }
    public static boolean Palindrome (String word){
        String [] letter = word.split("");
        String [] copyArray = Arrays.copyOfRange(letter,0,letter.length);
        for (int i = 0; i < letter.length/2; i++) {
            String saveLetter = letter[i];
            letter[i] = letter[letter.length-1];
            letter[letter.length-1] = saveLetter;

        }
        return  Arrays.equals(letter,copyArray);
    }
}
