package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split("\\+");
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                char nextCurrent = (char)(words[i].charAt(j) + 3);
                print.append(nextCurrent);

            }
        }
        System.out.println(print.toString());
    }
}
