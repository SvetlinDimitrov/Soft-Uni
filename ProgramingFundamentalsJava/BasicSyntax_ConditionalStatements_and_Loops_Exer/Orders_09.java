package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        double sumAll = 0;
        for (int i = 1; i <=n ; i++) {
            double sum = 0;
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());
            sum = (days * countCapsule) * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
            sumAll+=sum;
        }
        System.out.printf("Total: $%.2f",sumAll);
    }
}
//o	Price per capsule - floating-point number in range [0.00…1000.00]
//o	Days – integer in range [1…31]
//o	Capsules count - integer in range [0…2000]