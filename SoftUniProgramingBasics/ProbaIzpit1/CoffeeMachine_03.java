package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffe = scanner.nextLine();
        String sugger = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch ( coffe){
            case "Espresso":
                if ( sugger.equals("Without")){
                    price = 0.9;
                }else if (sugger.equals("Normal")){
                    price = 1 ;
                }else if ( sugger.equals("Extra")){
                    price = 1.2;
                }
                break;
            case "Cappuccino":
                if ( sugger.equals("Without")){
                    price = 1;
                }else if (sugger.equals("Normal")){
                    price = 1.2 ;
                }else if ( sugger.equals("Extra")){
                    price = 1.6;
                }
                break;
            case "Tea":
                if ( sugger.equals("Without")){
                    price = 0.5;
                }else if (sugger.equals("Normal")){
                    price = 0.6 ;
                }else if ( sugger.equals("Extra")){
                    price = 0.7;
                }
                break;

        }
        double priceAll = price * number;
        if ( sugger.equals("Without")){
            priceAll = priceAll - (priceAll * 0.35);
        }
        if (coffe .equals("Espresso") && number >= 5){
            priceAll = priceAll - (priceAll * 0.25);
        }
        if ( priceAll > 15) {
            priceAll = priceAll - (priceAll * 0.20);
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",number,coffe ,priceAll);
    }
}
