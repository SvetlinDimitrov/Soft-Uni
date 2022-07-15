package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yong = Integer.parseInt(scanner.nextLine());
        int Old = Integer.parseInt(scanner.nextLine());
        String field = scanner.nextLine();
        double priceYong = 0 ;
        double priceOld = 0;
        int all = yong + Old ;
        switch (field) {
            case "trail":
                priceYong = yong * 5.5 ;
                priceOld = Old * 7 ;
                break;
            case "cross-country":
                priceYong = yong * 8 ;
                priceOld = Old * 9.5 ;
                break;
            case "downhill":
                priceYong = yong * 12.25 ;
                priceOld = Old * 13.75 ;
                break;
            case "road":
                priceYong = yong * 20 ;
                priceOld = Old * 21.5 ;
                break;
        }
        double priceAll = priceOld + priceYong;
        if (field.equals("cross-country") && all >=50) {
            priceAll= priceAll - ( priceAll * 0.25)  ;
        }
        priceAll = priceAll - (priceAll * 0.05);
System.out.printf("%.2f" , priceAll) ;
    }
}
//        •	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
//        •	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
//        •	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
