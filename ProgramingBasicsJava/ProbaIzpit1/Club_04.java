package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String drink = scanner.nextLine();
        double Allmoney = 0;


        while (!drink.equals("Party!")) {
            int money = drink.length();
            int numberOfDrinks = Integer.parseInt(scanner.nextLine());
            Allmoney = Allmoney + (money * numberOfDrinks);

            if (!((money * numberOfDrinks )% 2 ==0)){
                Allmoney = Allmoney - (Allmoney * 0.25);
            }
            if (Allmoney > input) {
                System.out.println("Target acquired.");
                break;
            }
            drink = scanner.nextLine();
        }

        if (drink.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", input - Allmoney);
        }
        System.out.printf("Club income - %.2f leva.", Allmoney);
    }
}

