package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenddPosition_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int Odd = 0;
        int Even = 0;
        int longg = 0;

        for (int i = start; i <= end ; i++) {

            count+=i;
            for (int j = 1; j <= 6; j++) {
                if ( j % 2 ==0){
                    Odd = Odd + ( count %10);
                }else {
                    Even = Even + ( count %10);
                }
                count = count /10;
            }
            if ( Odd == Even){
                System.out.printf("%d ",i);
            }
            Odd =0;
            Even = 0;

        }
    }
}
