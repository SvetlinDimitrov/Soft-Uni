package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numberFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceFlower = 0 ;

        switch (flower) {
            case "Roses" :
                priceFlower = numberFlower * 5 ;
                if ( numberFlower > 80 ) {
                    priceFlower = priceFlower - (priceFlower *0.10);
                }
                break;
            case "Dahlias" :
                priceFlower = numberFlower * 3.80 ;
                if (numberFlower > 90) {
                    priceFlower = priceFlower - (priceFlower * 0.15);
                }
                break;
            case "Tulips" :
                priceFlower = numberFlower * 2.80 ;
                if (numberFlower > 80) {
                    priceFlower = priceFlower - (priceFlower * 0.15);
                }
                break;
            case "Narcissus" :
                priceFlower = numberFlower * 3 ;
                if (numberFlower < 120) {
                    priceFlower = priceFlower + (priceFlower * 0.15);
                }
                break;
            case "Gladiolus" :
                priceFlower = numberFlower * 2.5;
                if (numberFlower < 80) {
                    priceFlower = priceFlower + (priceFlower * 0.20);
                }
                break;
        }
        if ( priceFlower < budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlower, flower, budget - priceFlower);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more." , priceFlower - budget) ;
        }
    }
}
//•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
//•	Брой цветя - цяло число в интервала [10…1000]
//•	Бюджет - цяло число в интервала [50…2500]