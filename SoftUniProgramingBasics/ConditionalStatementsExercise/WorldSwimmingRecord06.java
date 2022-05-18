package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        double recordSec = Double.parseDouble(scanner.nextLine());
        double rastoqnieMetri = Double.parseDouble(scanner.nextLine());
        double timeSec1m = Double.parseDouble(scanner.nextLine());
        double rastVsecuundi = rastoqnieMetri * timeSec1m ;
        double rastZabavqne = Math.floor(rastoqnieMetri / 15 );
        double rastZabavqneS = rastZabavqne * 12.5 ;
        double obshtoVreme = rastVsecuundi + rastZabavqneS ;
        if ( recordSec < obshtoVreme) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(recordSec - obshtoVreme)) ;
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",obshtoVreme);
        }

    }
}
//        1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
//        2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
//        3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
