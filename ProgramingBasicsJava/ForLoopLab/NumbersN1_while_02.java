package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class NumbersN1_while_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n >= 1){
            System.out.printf("%d%n",n);
            n--;

        }
    }
}
