package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double statistOitfit = Double.parseDouble(scanner.nextLine());


        double dekor = budget * 0.1 ;
        double outfit = statistOitfit * statist ;
        if ( statist > 150){
            outfit = outfit - (outfit *0.1);
        }
        double moneyFilm = dekor + outfit ;
        if (budget > moneyFilm){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - moneyFilm);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-moneyFilm));
        }
    }
}
