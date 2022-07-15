package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "" ;
        String placeTovisit = "" ;
        double price = 0 ;
        switch(season) {
            case "Summer":
                if (budget <= 1000) {
                    location = "Camp";
                    placeTovisit = "Alaska";
                    price = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Hut";
                    placeTovisit = "Alaska";
                    price = budget * 0.80;
                }
                break;
            case "Winter":

                if (budget <= 1000) {
                    location = "Camp";
                    placeTovisit = "Morocco";
                    price = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Hut";
                    placeTovisit = "Morocco";
                    price = budget * 0.60;
                    break;
                }
        }
        if(budget > 3000 ) {
            location = "Hotel";
            if (season.equals("Summer")) {
                placeTovisit = "Alaska";
            }else {
                placeTovisit = "Morocco";
            }
            price = budget * 0.90;
        }
        System.out.printf("%s – %s – %.2f",placeTovisit , location , price) ;
    }
}
//•	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
//•	Втори ред –  Сезон – текст "Summer" или "Winter"