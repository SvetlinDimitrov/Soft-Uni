package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_26_June_2022;

import java.util.Scanner;

public class BurgerBus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= times; i++) {
            String city = scanner.nextLine();
            double ownerMake = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());
            if (i % 5 == 0) {
                ownerMake -= ownerMake * 0.1;
            } else if (i % 3 == 0) {
                ownerExpenses += ownerExpenses * 0.5;
            }

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, ownerMake - ownerExpenses);
            sum +=ownerMake - ownerExpenses;
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",sum);
    }
}
