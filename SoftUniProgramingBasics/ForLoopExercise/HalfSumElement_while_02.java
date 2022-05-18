package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_while_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1 ;
        int max = Integer.MIN_VALUE;
        int sum= 0 ;
        while( i<=n){
            int numbers = Integer.parseInt(scanner.nextLine());
            if ( max < numbers){
                max = numbers;
            }
            sum+=numbers;
            i++;
        }
        if (max == sum-max){
            System.out.printf("Yes%nSum = %d",max);
        }else{
            System.out.printf("No%nDiff = %d",Math.abs(max - (sum-max)));
        }
    }
}
