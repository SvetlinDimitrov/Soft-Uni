package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        String words = scanner.nextLine();
        double moneyEarn = 0;
        boolean flag = false;

        while (!words.equals("closed")) {
            String wordsThing = scanner.nextLine();
            switch (words) {
                case "haircut":
                    if (wordsThing.equals("mens")) {
                        moneyEarn += 15;
                    } else if (wordsThing.equals("ladies")) {
                        moneyEarn += 20;
                    } else if (wordsThing.equals("kids")) {
                        moneyEarn += 10;
                    }
                    break;
                case "color":
                    if (wordsThing.equals("touch up")) {
                        moneyEarn += 20;
                    } else if (wordsThing.equals("full color")) {
                            moneyEarn += 30;
                        }

                    break;

            }
            if (moneyEarn >= money) {
                flag = true;
                break;
            }


            words = scanner.nextLine();
        }
        if (flag) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n", money - moneyEarn);
        }
        System.out.printf("Earned money: %.0flv.",moneyEarn);
    }
}
