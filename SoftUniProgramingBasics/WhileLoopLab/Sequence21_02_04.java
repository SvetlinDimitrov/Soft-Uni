package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Sequence21_02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while ( i <= number ){
            System.out.printf("%d%n",i);
            i = (i * 2 ) + 1;
        }
    }
}
