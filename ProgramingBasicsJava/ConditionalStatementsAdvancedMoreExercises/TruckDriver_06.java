package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmMonth = Double.parseDouble(scanner.nextLine());
        double priceKm = 0 ;
        switch (season) {
            case "Spring" :
            case "Autumn" :
                if ( kmMonth <= 5000) {
                    priceKm = 0.75 * kmMonth ;
                } else if (5000 < kmMonth && kmMonth <= 10000){
                    priceKm =  0.95 * kmMonth ;
                }
                break;
            case "Summer" :
                if ( kmMonth <= 5000) {
                    priceKm = 0.9 * kmMonth ;
                } else if (5000 < kmMonth && kmMonth <= 10000){
                    priceKm =  1.10 * kmMonth ;
                }
                break;
            case "Winter" :
                if ( kmMonth <= 5000) {
                    priceKm = 1.05 * kmMonth ;
                } else if (5000 < kmMonth && kmMonth <= 10000){
                    priceKm =  1.25 * kmMonth ;
                }
                break;
        }
        if (10000 < kmMonth && kmMonth <= 20000) {
            priceKm = 1.45 * kmMonth ;
        }
        priceKm = (priceKm * 4) - ((priceKm * 4) * 0.1);
        System.out.printf("%.2f", priceKm) ;
    }
}
//•	Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
//•	Втори ред –  Километри на месец – реално число в интервала [10.00...20000.00]