package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Zprodan = Integer.parseInt(scanner.nextLine());
        int rabotnici = Integer.parseInt(scanner.nextLine());
        double PloshtZaVino = X *  0.4 ;
        double kilogramGrozde = Y * PloshtZaVino ;
        double litriVino = kilogramGrozde / 2.5 ;
        if (Zprodan < litriVino) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.", litriVino, Math.abs(Zprodan - litriVino), Math.abs((Zprodan - litriVino) / rabotnici));
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.abs(Zprodan - litriVino));
        }
    }
}
//        •	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
//        •	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
//        •	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
//        •	4ти ред: брой работници – цяло число в интервала [1 … 20]
