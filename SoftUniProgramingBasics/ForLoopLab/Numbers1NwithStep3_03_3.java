package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class Numbers1NwithStep3_03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for ( int i = 1 ; i <= n ; i+=3){
            System.out.printf("%d%n", i);
        }
    }
}
