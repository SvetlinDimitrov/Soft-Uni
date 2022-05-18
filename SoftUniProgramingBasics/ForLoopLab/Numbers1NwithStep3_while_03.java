package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class Numbers1NwithStep3_while_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int number = 1 ;
        while (n >= number){
            System.out.printf("%d%n",number);
            number = number +3;
        }
    }
}
