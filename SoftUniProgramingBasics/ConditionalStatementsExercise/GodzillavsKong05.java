package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillavsKong05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pariFilm = Double.parseDouble(scanner.nextLine());
        int statista = Integer.parseInt((scanner.nextLine()));
        double cenastatist = Double.parseDouble(scanner.nextLine());
        double dekor = pariFilm * 0.1;
        cenastatist = cenastatist * statista ;
        if (statista > 150) {
            cenastatist = cenastatist - (cenastatist * 0.1);
        }
        double obshtaCena = dekor + cenastatist;
        if (obshtaCena > pariFilm) {
            System.out.printf("Not enough money! \n" +
                    "Wingard needs %.2f leva more.", Math.abs(pariFilm - obshtaCena));
        } else {
            System.out.printf("Action! \n" +
                    "Wingard starts filming with %.2f leva left.", pariFilm - obshtaCena);

        }
    }
}
//Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
//        Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
//        Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
