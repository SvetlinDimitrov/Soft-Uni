package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTank08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double kolichestvo = Double.parseDouble(scanner.nextLine());
        if ( kolichestvo <25 && name.equals("Diesel")) {
            System.out.println ("Fill your tank with diesel!");
        } else if (kolichestvo >= 25 && name.equals("Diesel")) {
            System.out.println("You have enough diesel.");
        }else if ( kolichestvo <25 && name.equals("Gasoline")) {
            System.out.println("Fill your tank with gasoline!");
        }else if (kolichestvo >= 25 && name.equals("Gasoline")) {
            System.out.println("You have enough gasoline.");
        }else if ( kolichestvo <25 && name.equals("Gas")) {
            System.out.println("Fill your tank with gas!");
        }else if (kolichestvo >= 25 && name.equals("Gas")) {
            System.out.println("You have enough gas.");
        }else {
            System.out.println("Invalid fuel!");
        }


    }
}
//: "Diesel", "Gasoline" или "Gas",