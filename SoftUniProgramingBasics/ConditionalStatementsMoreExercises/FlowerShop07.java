package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FlowerShop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zombita = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double podarukCena = Double.parseDouble(scanner.nextLine());
        double magnoliiCena = magnolii * 3.25;
        double zombitaCena = zombita * 4;
        double roziCena = rozi * 3.50;
        double kaktusiCena = kaktusi * 8;
        double obshtaCena = magnoliiCena + zombitaCena + roziCena + kaktusiCena;
        obshtaCena = obshtaCena - (obshtaCena * 0.05) ;
        if (podarukCena < obshtaCena) {
            System.out.printf("She is left with %.0f leva.", Math.floor(obshtaCena - podarukCena));

        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(podarukCena - obshtaCena));


        }
    }
}
//        •	Брой магнолии – цяло число в интервала [0 … 50]
//        •	Брой зюмбюли – цяло число в интервала [0 … 50]
//        •	Брой рози – цяло число в интервала [0 … 50]
//        •	Брой кактуси – цяло число в интервала [0 … 50]
//        •	Цена на подаръка – реално число в интервала [0.00 … 500.00]
//        •	Магнолии – 3.25 лева
//        •	Зюмбюли – 4 лева
//        •	Рози – 3.50 лева
//        •	Кактуси – 8 лева

