package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double priceChrysan = 0 ;
        double priceRoses = 0;
        double priceTulips = 0;
        int allFlowers = chrysanthemums + roses + tulips ;
        double allPrice = 0 ;
        switch (season) {
            case "Spring":
            case "Summer":
                priceChrysan = chrysanthemums * 2 ;
                priceRoses = roses * 4.10 ;
                priceTulips = tulips * 2.50 ;
                break;
            case "Autumn":
            case "Winter":
                priceChrysan = chrysanthemums * 3.75 ;
                priceRoses = roses * 4.50 ;
                priceTulips = tulips * 4.15 ;
                break;
        }
        allPrice = priceChrysan + priceRoses + priceTulips ;
        if (holiday.equals("Y")) {
            allPrice = allPrice + (allPrice * 0.15);
        }
        if (tulips > 7 && season.equals("Spring")) {
            allPrice = allPrice - ( allPrice * 0.05) ;
        }
        if (roses >= 10 && season.equals("Winter")) {
            allPrice = allPrice - (allPrice * 0.1);
        }
        if (allFlowers >= 20 ) {
            allPrice = allPrice - (allPrice * 0.2);
        }


        System.out.printf("%.2f",allPrice + 2 ) ;
    }
}
//•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
//•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
//•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
//•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
//•	На петия ред е посочено дали денят е празник – [Y – да / N - не]