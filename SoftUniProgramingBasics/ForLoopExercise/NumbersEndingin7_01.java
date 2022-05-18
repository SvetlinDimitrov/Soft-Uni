package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class NumbersEndingin7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for ( int i = 1 ; i <= 1000 ; i+=1) {
            if ( i %10 == 7) {
                System.out.printf("%d%n",i);
            }
        }
    }
}
