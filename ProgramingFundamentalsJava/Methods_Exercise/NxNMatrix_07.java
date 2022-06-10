package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = ReadingInteger(scanner);
        for (int i = 0; i < times; i++) {
            Loop1(times);
            System.out.println();
        }

    }
    public static int ReadingInteger (Scanner scanner){
        return Integer.parseInt(scanner.nextLine());
    }
    public static void Loop1 (int num1){
        for (int i = 0; i < num1; i++) {
            System.out.printf("%d " , num1);
        }
    }
}
