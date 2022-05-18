package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chas = Integer.parseInt (scanner.nextLine());
        int minuti = Integer.parseInt (scanner.nextLine());
        int totalTime = (chas*60) + minuti + 15 ;
        chas = totalTime/60 ;
        minuti = totalTime % 60 ;
        if (chas > 23 ) {
            chas =0 ;
        }
        if ( minuti < 10 ) {
            System.out.printf ( "%d:0%d" , chas , minuti) ;
        }else {
            System.out.printf ( "%d:%d" , chas , minuti) ;
        }



    }
}
