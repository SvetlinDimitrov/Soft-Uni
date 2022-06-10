package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class CharactersinRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);
        CharacterInRange(c1, c2);
    }

    public static void CharacterInRange(char c1, char c2) {
        if (c1 < c2) {
            for (int i = c1 + 1; i < c2; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = c2 + 1; i < c1; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
    }
