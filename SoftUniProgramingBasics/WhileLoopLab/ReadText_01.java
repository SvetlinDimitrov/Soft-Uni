package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        while(!words.equals("Stop")){
            System.out.printf("%s%n", words);
            words = scanner.nextLine();
        }
    }
}
