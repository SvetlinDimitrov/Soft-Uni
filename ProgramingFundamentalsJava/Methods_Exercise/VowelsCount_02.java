package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(VowelsCount(word));

    }
    public static int VowelsCount (String word ){
        char [] letters = new char [word.length()];
        int count =0;
        for (int i = 0; i <= letters.length-1; i++) {
            letters[i] = word.charAt(i);
            if (letters[i] == 'A' || letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'E' ||letters[i] == 'I' || letters[i] == 'i' ||letters[i] == 'O' || letters[i] == 'o' ||letters[i] == 'u' || letters[i] == 'U' ){
                count++;
            }
        }
        return count;

    }
}
//A, E, I, O, U