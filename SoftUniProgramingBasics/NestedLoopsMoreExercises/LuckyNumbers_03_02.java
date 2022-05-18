package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class LuckyNumbers_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int happyNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        int fistTwo = i+j;
                        int secondTwo =k+l;
                        if (fistTwo == secondTwo){
                            if (happyNumber % (i+j) ==0){
                                System.out.printf("%d%d%d%d ",i,j,k,l);
                            }
                        }

                    }

                }

            }

        }
    }
}
