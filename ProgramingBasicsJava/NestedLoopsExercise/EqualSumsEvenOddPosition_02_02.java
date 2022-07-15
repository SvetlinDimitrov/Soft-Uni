package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        for (int i = firstNumber; i <= secondNumber; i++) {
            int sumEqual = 0;
            int sumEven =0;
            int number = i;
            for (int j = 3; j >= 1; j--) {
                sumEqual += number % 10;
                number = number /100 ;
            }
            number = i;
            for (int k = 3; k >=1 ; k--) {
                number = number/10;
                sumEven += number %10;
                number = number/10;
            }
            if (sumEqual == sumEven){
                System.out.printf("%d ",i);
            }
        }
    }
}
