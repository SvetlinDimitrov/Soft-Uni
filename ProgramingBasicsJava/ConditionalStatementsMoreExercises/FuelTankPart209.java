package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTankPart209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double gorivo = Double.parseDouble(scanner.nextLine());
        String karta = scanner.nextLine();
        double benzin ;
        double dizel ;
        double gas ;

        if (karta.equals("Yes") && name.equals("Gas") && gorivo > 25) {
            gas = gorivo * (0.93 - 0.08) - (gorivo * (0.93 - 0.08)) * 0.1;
            System.out.printf("%.2f lv.", gas);
        } else if ((karta.equals("Yes") && name.equals("Gas")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            gas = gorivo * (0.93 - 0.08) - (gorivo * (0.93 - 0.08)) * 0.08;
            System.out.printf("%.2f lv.", gas);
        } else if (karta.equals("Yes") && name.equals("Gas")) {
            gas = gorivo * (0.93 - 0.08);
            System.out.printf("%.2f lv.", gas);
        } else if (karta.equals("No") && name.equals("Gas") && gorivo > 25) {
            gas = gorivo * 0.93 - (gorivo * 0.93 * 0.1);
            System.out.printf("%.2f lv.", gas);
        } else if ((karta.equals("No") && name.equals("Gas")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            gas = gorivo * 0.93 - (gorivo * 0.93 * 0.08);
            System.out.printf("%.2f lv.", gas);
        } else if (karta.equals("No") && name.equals("Gas")) {
            gas = gorivo * 0.93;
            System.out.printf("%.2f lv.", gas);
        }
        if (karta.equals("Yes") && name.equals("Gasoline") && gorivo > 25) {
            benzin = gorivo * (2.22 - 0.18) - (gorivo * (2.22 - 0.18)) * 0.1;
            System.out.printf("%.2f lv.", benzin);
        } else if ((karta.equals("Yes") && name.equals("Gasoline")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            benzin = gorivo * (2.22 - 0.18) - (gorivo * (2.22 - 0.18)) * 0.08;
            System.out.printf("%.2f lv.", benzin);
        } else if (karta.equals("Yes") && name.equals("Gasoline")) {
            benzin = gorivo * (2.22 - 0.18);
            System.out.printf("%.2f lv.", benzin);
        } else if (karta.equals("No") && name.equals("Gasoline") && gorivo > 25) {
            benzin = gorivo * 2.22 - (gorivo * 2.22 * 0.1);
            System.out.printf("%.2f lv.", benzin);
        } else if ((karta.equals("No") && name.equals("Gasoline")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            benzin = gorivo * 2.22 - (gorivo * 2.22 * 0.08);
            System.out.printf("%.2f lv.", benzin);
        } else if (karta.equals("No") && name.equals("Gasoline")) {
            benzin = gorivo * 2.22;
            System.out.printf("%.2f lv.", benzin);
        }
        if (karta.equals("Yes") && name.equals("Diesel") && gorivo > 25) {
            dizel = gorivo * (2.33 - 0.12) - (gorivo * (2.33 - 0.12)) * 0.1;
            System.out.printf("%.2f lv.", dizel);
        } else if ((karta.equals("Yes") && name.equals("Diesel")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            dizel = gorivo * (2.33 - 0.12) - (gorivo * (2.33 - 0.12)) * 0.08;
            System.out.printf("%.2f lv.", dizel);
        } else if (karta.equals("Yes") && name.equals("Diesel")) {
            dizel = gorivo * (2.33 - 0.12);
            System.out.printf("%.2f lv.", dizel);
        } else if (karta.equals("No") && name.equals("Diesel") && gorivo > 25) {
            dizel = gorivo * 2.33 - (gorivo * 2.33 * 0.1);
            System.out.printf("%.2f lv.", dizel);
        } else if ((karta.equals("No") && name.equals("Diesel")) && (gorivo == 20 || gorivo == 21 || gorivo == 22 || gorivo == 23 || gorivo == 24 || gorivo == 25)) {
            dizel = gorivo * 2.33 - (gorivo * 2.33 * 0.08);
            System.out.printf("%.2f lv.", dizel);
        } else if (karta.equals("No") && name.equals("Diesel")) {
            dizel = gorivo * 2.33;
            System.out.printf("%.2f lv.", dizel);
        }
    }
}



//        •	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
//        •	Количество гориво – реално число в интервала [1.00 … 50.00]
//        •	Притежание на клубна карта – текст с възможности: "Yes" или "No"
//        •	Бензин – 2.22 лева за един литър,
//        •	Дизел – 2.33 лева за един литър
//        •	Газ – 0.93 лева за литър
