package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999; i++) {
            int numberI = i;
            int numberI1 =0;
            for (int j = 1; j <=4 ; j++) {
                numberI1 = numberI%10;
                if(numberI1 ==0){
                    break;
                }
                if(n % numberI1==0){
                    numberI= numberI / 10;
                }else {
                    break;
                }
                if(j==4){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
