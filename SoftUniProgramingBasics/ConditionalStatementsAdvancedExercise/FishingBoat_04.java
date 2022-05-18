package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double boat = 0;
        switch (season) {
            case "Spring":
                boat += 3000;
                break;
            case "Summer":
            case "Autumn":
                boat += 4200;
                break;
            case "Winter":
                boat += 2600;
                break;
        }
        if (fisherman <= 6) {
            boat = boat - (boat * 0.1);
        } else if (fisherman > 7 && fisherman <= 11) {
            boat = boat - (boat * 0.15);
        } else if (fisherman > 12) {
            boat = boat - (boat * 0.25);
        }
        if ( (fisherman % 2 == 0) && ((season.equals("Spring")) ||(season.equals("Summer")) || (season.equals("Winter")) )) {
            boat = boat - (boat * 0.05);
        }
        if ( boat < budget) {
            System.out.printf ("Yes! You have %.2f leva left." , budget - boat ) ;
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",boat-budget) ;
        }
    }
}
//Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
//Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

//•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//•	Ако групата е от 12 нагоре  –  отстъпка от 25%.

//•	Бюджет на групата – цяло число в интервала [1…8000]
//•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
//•	Брой рибари – цяло число в интервала [4…18]
//•	Цената за наем на кораба през пролетта е  3000 лв.
//•	Цената за наем на кораба през лятото и есента е  4200 лв.
//•	Цената за наем на кораба през зимата е  2600 лв.
