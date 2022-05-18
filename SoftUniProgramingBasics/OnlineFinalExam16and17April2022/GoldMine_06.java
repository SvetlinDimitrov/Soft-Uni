package SoftUniProgramingBasics.OnlineFinalExam16and17April2022;

import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            int gold = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double goldPerDays = 0;

            for (int j = 1; j <= days; j++) {
                double goldForOneDAY = Double.parseDouble(scanner.nextLine());
                goldPerDays += goldForOneDAY;
                if (j == days) {
                    if (goldPerDays / days >= gold) {
                        System.out.printf("Good job! Average gold per day: %.2f.%n", goldPerDays / days);
                    } else {
                        System.out.printf("You need %.2f gold.", gold - goldPerDays/days);
                    }
                }

            }
        }
    }
}
