package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;

        while(!input.equals("NoMoreMoney")){
            double amount = Double.parseDouble(input);
            if (amount < 0 ){
                System.out.println("Invalid operation!");
                break;
            }
            sum += amount;
            System.out.printf("Increase: %.2f%n",amount);

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",sum);
    }
}
