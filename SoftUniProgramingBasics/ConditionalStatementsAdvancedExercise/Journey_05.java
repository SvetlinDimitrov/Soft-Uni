package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String placeToRest = "";
        double priceToSpend = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                priceToSpend = budget - (budget * 0.3);
            } else {
                priceToSpend = budget - (budget * 0.7);
            }
        } else if ( budget <=1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                priceToSpend = budget - (budget * 0.4);
            } else {
                priceToSpend = budget - (budget * 0.8);
            }
        }else if  ( budget > 1000) {
            destination = "Europe";
            priceToSpend = budget - (budget * 0.9);
        }
        if (season.equals("summer")) {
            placeToRest = "Camp" ;
        }else {
            placeToRest = "Hotel" ;
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", placeToRest , budget - priceToSpend);
    }
}
//•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
//•	Втори ред –  Един от двата възможни сезона: „summer” или “winter”

//•	При 100лв. или по-малко – някъде в България
//o	Лято – 30% от бюджета
//o	Зима – 70% от бюджета
//•	При 1000лв. или по малко – някъде на Балканите
//o	Лято – 40% от бюджета
//o	Зима – 80% от бюджета
//•	При повече от 1000лв. – някъде из Европа
//o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.