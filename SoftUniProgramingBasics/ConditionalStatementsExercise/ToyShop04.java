package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaEkskur = Double.parseDouble(scanner.nextLine());
        int puzeli = Integer.parseInt(scanner.nextLine());
        int kukli = Integer.parseInt(scanner.nextLine());
        int mecheta = Integer.parseInt(scanner.nextLine());
        int mini = Integer.parseInt(scanner.nextLine());
        int kamioni = Integer.parseInt(scanner.nextLine());
        double puzeliCena = puzeli * 2.60;
        double kukliCena = kukli * 3;
        double mechetaCena = mecheta * 4.10;
        double minioniCena = mini * 8.20;
        double kamioniCena = kamioni * 2;
        int obshtoigra = puzeli + kukli + mecheta + mini + kamioni;
        double obshtacena = puzeliCena + kukliCena + mechetaCena + minioniCena + kamioniCena;
        double namalenie =0;
        double pechalba = 0;
        if (obshtoigra > 50) {
            namalenie = obshtacena * 0.25;
        }
        obshtacena = obshtacena - namalenie;
        pechalba = obshtacena - (obshtacena * 0.1);
        if (pechalba > cenaEkskur) {
            System.out.printf("Yes! %.2f lv left.", pechalba - cenaEkskur);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(pechalba - cenaEkskur));
        }
    }
}

