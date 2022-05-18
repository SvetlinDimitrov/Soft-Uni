package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String ticket = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double priceRoad = 0 ;
        if (ticket.equals("VIP")) {
            price = 499.99 * people;
        } else {
            price = 249.99 * people;
        }


        if (people <= 4) {
            priceRoad = budget * 0.75 ;
        }else if (people >=5 && people <=9) {
            priceRoad = budget * 0.6 ;
        }else if (people >= 10 && people <=24) {
            priceRoad = budget * 0.5 ;
        }else if (people >=25 && people <= 49) {
            priceRoad = budget * 0.4 ;
        }else {
            priceRoad = budget * 0.25 ;
        }
        price = priceRoad + price ;

        if (budget > price) {
            System.out.printf("Yes! You have %.2f leva left." , budget - price) ;
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }

    }
}
//•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
//•	На втория ред е категорията – "VIP" или "Normal"
//•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]

//•	IP – 499.99 лева.
//•	Normal – 249.99 лева.

//От 1 до 4 – 75% от бюджета.
//•	От 5 до 9 – 60% от бюджета.
//•	От 10 до 24 – 50% от бюджета.
//•	От 25 до 49 – 40% от бюджета.
//•	50 или повече – 25% от бюджета.