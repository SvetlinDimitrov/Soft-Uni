package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nameS = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int timeRest = Integer.parseInt(scanner.nextLine());
        double timeForLunch = timeRest/8.0 ;
        double timeForOtdih = timeRest/4.0 ;
        double rest = timeRest-(timeForOtdih + timeForLunch) ;
        if ( timeEpisode <= rest) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameS, rest - timeEpisode);
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameS ,Math.ceil(Math.abs(rest - timeEpisode))) ;
        }

    }
}
