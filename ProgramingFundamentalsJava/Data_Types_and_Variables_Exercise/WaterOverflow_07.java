package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timesDrink = Integer.parseInt(scanner.nextLine());
        int waterTank = 255;
        int sum = 0;

        for (int i = 1; i <= timesDrink ; i++) {
            int singleDrink = Integer.parseInt(scanner.nextLine());
            if (waterTank >= singleDrink) {
                waterTank -= singleDrink;
                sum +=singleDrink;
            } else {
                System.out.println("Insufficient capacity!");

            }
        }
        System.out.println(sum);
    }
}
