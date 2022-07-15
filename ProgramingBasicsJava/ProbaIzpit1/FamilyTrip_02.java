package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double payNights = Double.parseDouble(scanner.nextLine());
        int payBonus = Integer.parseInt(scanner.nextLine());

        if ( nights > 7){
            payNights = payNights- (payNights *0.05);
        }

        double nightsPay = nights * payNights;

        double bonus = (budget * payBonus/100);
        nightsPay += bonus;
        if ( nightsPay < budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - nightsPay);
        }else {
            System.out.printf("%.2f leva needed.", nightsPay - budget);
        }
    }
}
