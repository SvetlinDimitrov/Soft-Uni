package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word  = scanner.nextLine();
        StringBuilder print = new StringBuilder();
        int detonation = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if(currentChar != '>' && detonation == 0 ){
                print.append(currentChar);
            }else {
                if (currentChar == '>') {
                    detonation += Integer.parseInt(word.charAt(i + 1) + "");
                    print.append(currentChar);
                } else {
                    detonation--;
                }
            }
        }
        System.out.println(print.toString());
    }
}
