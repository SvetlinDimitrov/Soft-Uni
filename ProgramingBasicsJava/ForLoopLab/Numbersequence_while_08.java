package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class Numbersequence_while_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 1;
        while ( i<=n){
            int numbers = Integer.parseInt(scanner.nextLine());
            if (min > numbers){
                min = numbers;
            }
            if (max < numbers){
                max=numbers;
            }
            i++;
        }
        System.out.printf("Max number: %d%n",max);
        System.out.printf("Min number: %d%n",min);
    }
}
