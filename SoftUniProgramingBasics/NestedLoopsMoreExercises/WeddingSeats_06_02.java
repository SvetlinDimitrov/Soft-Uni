package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class WeddingSeats_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endN = scanner.nextLine().charAt(0);
        int round = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int count =0 ;
int Nsave = N;

        for (int i = 65; i <= endN ; i++) {
            if (i > 65){
                N= Nsave;
                round++;
            }
            for (int j = 1; j <=round ; j++) {
                if(j%2==0){
                    N+=2;
                }if(j!=1 && j%2!=0){
                    N-=2;
                }
                for (int k = 97; k <97+N ; k++) {
                    count++;
                    System.out.printf("%C%d%c%n",i,j,k);

                }

            }
            
        }
        System.out.printf("%d",count);
    }
}
