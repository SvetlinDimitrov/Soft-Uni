package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class OddEvenSum_while_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int i = 1 ;
        while ( i <= n ){
            int numbers = Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                sum1 += numbers;
            }else {
                sum2 += numbers;
            }
            i++;
        }
        if ( sum1 == sum2){
            System.out.printf("Yes%nSum = %d",sum1);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(sum1-sum2));
        }
    }
}
