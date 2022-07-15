package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());
        int rabDni = 365 - restDays ;
        double restDaysIgra = restDays * 127 ;
        double rabDniIgra = rabDni * 63 ;
        double VremeZaIgra = restDaysIgra + rabDniIgra ;
        double dopulnenie = Math.abs(30000 - VremeZaIgra);
        if (VremeZaIgra > 30000) {

            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", Math.floor(dopulnenie/60) , dopulnenie%60);
        } else {
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", Math.floor(dopulnenie/60) , dopulnenie%60) ;
        }
    }
}
