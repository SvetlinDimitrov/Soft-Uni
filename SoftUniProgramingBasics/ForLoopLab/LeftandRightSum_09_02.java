package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class LeftandRightSum_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0 ;
        int second = 0 ;
        for ( int i = 1 ; i<=n*2 ; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if ( i <= n/2){
                first+=number ;

            }else  {
                second+=number;
            }
        }
        if ( first == second ) {
            System.out.printf("Yes, sum = %d", first);
        }else {
            System.out.printf("No, diff = %d", Math.abs(first-second));
        }
    }
}
