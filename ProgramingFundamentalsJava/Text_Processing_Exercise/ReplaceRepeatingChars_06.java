package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] charArray = scanner.nextLine().toCharArray();
        StringBuilder print = new StringBuilder();
        print.append(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            if(charArray[i-1] != charArray[i]){
                print.append(charArray[i]);
            }
        }

        System.out.println(print.toString());
    }
}
//aaaaabbbbbcdddeeeedssaa