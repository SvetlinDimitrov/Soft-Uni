package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class NumberSequence_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i <= n ; i++){
            int numbers = Integer.parseInt(scanner.nextLine());
            if (min > numbers){
                min =numbers;
            } else if (max < numbers){
                max =numbers;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d",max , min );
    }
}
