package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees  = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";
        switch (day) {
            case "Morning":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                }else if (18 < degrees && degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }else if (degrees >=25) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }else if (degrees >=25) {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }else if (degrees >=25) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees ,Outfit , Shoes) ;
    }
}
