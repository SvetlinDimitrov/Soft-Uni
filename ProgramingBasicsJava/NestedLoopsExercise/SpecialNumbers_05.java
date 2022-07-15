package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  SpecialNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            int count= 0;
            int numbers = i;
            int number = 0;

            for (int j = 1; j <=4 ; j++) {
                number = numbers % 10;
                if (number == 0){
                    break;
                }
                if ( SpecialNumber % number == 0){
                    count++;
                }
                numbers= numbers/10;
            }
            if ( count ==4 ){
                System.out.printf("%d ",i);
            }


        }
    }
}
