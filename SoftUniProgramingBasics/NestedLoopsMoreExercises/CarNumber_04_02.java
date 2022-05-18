package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class CarNumber_04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginN = Integer.parseInt(scanner.nextLine());
        int endN = Integer.parseInt(scanner.nextLine());

        for (int i = beginN; i <=endN ; i++) {
            for (int j = beginN; j <=endN ; j++) {
                for (int k = beginN; k <=endN ; k++) {
                    for (int l = beginN; l <=endN ; l++) {
                        if((i%2==0 && l%2!=0) || (i%2!=0 && l%2==0)){
                            if(i>l){
                                if((j+k)%2==0){
                                    System.out.printf("%d%d%d%d ",i,j,k,l);
                                }
                            }
                        }

                    }

                }

            }

        }
    }
}
