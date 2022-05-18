package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Sequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFinal = Integer.parseInt(scanner.nextLine());
        int sum = 1 ;
        while(sum <= numberFinal){
            System.out.printf("%d%n",sum);
            sum = (sum *2) + 1;

        }
    }
}
