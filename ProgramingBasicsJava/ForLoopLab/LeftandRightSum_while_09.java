package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class LeftandRightSum_while_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1 ;
        int sum1 = 0;
        int sum2 = 0;
        while ( i <= n){
            int numbers = Integer.parseInt(scanner.nextLine());
            sum1 += numbers;
            i++;
        }
        while (i <= n*2){
            int numbers = Integer.parseInt(scanner.nextLine());
            sum2 += numbers;
            i++;
        }
        if ( sum1 == sum2){
            System.out.printf("Yes, sum = %d",sum1);
        }else {
            System.out.printf("No, diff = %d",Math.abs(sum1-sum2));
        }
    }
}
