package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Scanner;

public class DecryptingMessages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plusNumber = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 0; i < times; i++) {
            char letter = scanner.nextLine().charAt(0);
            int charLetter = letter + plusNumber;
            char realLetter = (char) charLetter;
            word+=realLetter;
        }
        System.out.println(word);
    }
}
