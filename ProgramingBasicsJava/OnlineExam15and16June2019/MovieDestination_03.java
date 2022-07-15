package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (destination){
            case "Dubai":
                if(season.equals("Winter")){
                    price = 45000;
                }else {
                    price = 40000;
                }
                break;
            case "Sofia":
                if(season.equals("Winter")){
                    price = 17000;
                }else {
                    price = 12500;
                }
                break;
            case "London":
                if(season.equals("Winter")){
                    price = 24000;
                }else {
                    price = 20250;
                }
                break;
        }
        price = price * days ;
        if(destination.equals("Dubai")){
            price = price - (price * 0.3);
        }else if(destination.equals("Sofia")) {
            price = price + (price * 0.25);
        }
            if ( budget < price){
                System.out.printf("The director needs %.2f leva more!",price - budget);
            }else {
                System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
            }

    }
}
