package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance_02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        double all = 0;
        while (!number.equals("NoMoreMoney")){
            double sum = Double.parseDouble(number);
            if (sum < 0){
                System.out.println("Invalid operation!");
                break;
            }
            all+=sum;
            System.out.printf("Increase: %.2f%n",sum);
            number = scanner.nextLine();

        }
        System.out.printf("Total: %.2f",all);
    }
}
