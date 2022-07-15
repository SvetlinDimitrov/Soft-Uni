package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class TournamentofChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int daysWins = 0;
        int daysLoses = 0;

        double allmoney = 0;


        for (int i = 1; i <= days; i++) {
            String sport = scanner.nextLine();
            int win = 0;
            int lose = 0;
            double money = 0;

            while (!sport.equals("Finish")) {
                String winLose = scanner.nextLine();

                if (winLose.equals("win")) {
                    win++;
                    money += 20;
                } else {
                    lose++;
                }
                sport = scanner.nextLine();
            }

            if (win > lose) {
                daysWins++;
                money = money + (money * 0.1);
            } else {
                daysLoses++;
            }

            allmoney += money;

        }
        if (daysWins > daysLoses) {
            allmoney = allmoney + (allmoney * 0.2);
            System.out.printf("You won the tournament! Total raised money: %.2f", allmoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allmoney);
        }
    }
}