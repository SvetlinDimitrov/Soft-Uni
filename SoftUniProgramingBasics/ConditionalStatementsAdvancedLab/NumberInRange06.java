package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if (number >= -100) {
            if (number != 0) {
                if (number <= 100) {
                    System.out.println("Yes");
                }
            } else {
                System.out.println("No");
            }

        }
    }
}
