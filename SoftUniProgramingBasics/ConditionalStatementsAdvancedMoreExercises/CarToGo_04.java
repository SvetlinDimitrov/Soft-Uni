package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clasCar = "";
        String car = "";
        double priceCar = 0 ;
        switch(season) {
            case "Summer":
                if (budget <= 100) {
                    clasCar = "Economy class";
                    car = "Cabrio";
                    priceCar = budget * 0.35;
                } else if (budget > 100 && budget <= 500) {
                    clasCar = "Compact class";
                    car = "Cabrio";
                    priceCar = budget * 0.45;
                }
                break;
            case "Winter":

                if (budget <= 100) {
                    clasCar = "Economy class";
                    car = "Jeep";
                    priceCar = budget * 0.65;
                } else if (budget > 100 && budget <= 500) {
                    clasCar = "Compact class";
                    car = "Jeep";
                    priceCar = budget * 0.80;
                    break;
                }
        }
        if(budget > 500 ) {
            clasCar = "Luxury class";
            car = "Jeep";
            priceCar = budget * 0.90;
        }
        System.out.printf("%s\n%s - %.2f", clasCar , car , priceCar);
    }
}
//•	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
//•	Втори ред –  Сезон – текст "Summer" или "Winter"