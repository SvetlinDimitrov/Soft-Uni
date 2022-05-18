package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double buget = Double.parseDouble(scanner.nextLine());
        int videokarti = Integer.parseInt(scanner.nextLine());
        int procesor = Integer.parseInt(scanner.nextLine());
        int pamet = Integer.parseInt(scanner.nextLine());
        double videokartiC = videokarti * 250;
        double procesorC = videokartiC * 0.35;
        double pametC = videokartiC * 0.1;
        procesorC = procesorC * procesor ;
        pametC = pametC * pamet ;
        double SmetkaKrai = videokartiC + procesorC + pametC;
        double otstupka = 0;
        if (procesor < videokarti) {
            otstupka = SmetkaKrai * 0.15;
            SmetkaKrai = SmetkaKrai - otstupka;
        }
        if (buget > SmetkaKrai) {
            System.out.printf("You have %.2f leva left!", buget - SmetkaKrai);

        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(buget - SmetkaKrai));
        }
    }
}
//•	Видеокарта – 250 лв./бр.
//        •	Процесор – 35% от цената на закупените видеокарти/бр.
//        •	Рам памет – 10% от цената на закупените видеокарти/бр.
