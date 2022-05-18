package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());
        int minute = (firstTime + secondTime + thirdTime ) / 60 ;
        int seconds = (firstTime + secondTime + thirdTime ) % 60 ;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minute, seconds) ;

        } else  {
            System.out.printf("%d:%d", minute , seconds);
        }

    }
}
