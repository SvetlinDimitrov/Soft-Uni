package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double allMoney = money * 100;
        int count = 0;
        while (allMoney > 0) {
            if (allMoney >= 200) {
                allMoney -= 200;
                count++;
            } else if (allMoney >= 100) {
                allMoney -= 100;
                count++;
            } else if (allMoney >= 50) {
                allMoney -= 50;
                count++;
            } else if (allMoney >= 20) {
                allMoney -= 20;
                count++;
            } else if (allMoney >= 10) {
                allMoney -= 10;
                count++;
            } else if (allMoney >= 5) {
                allMoney -= 5;
                count++;
            } else if (allMoney >= 2) {
                allMoney -= 2;
                count++;
            } else if (allMoney >= 1) {
                allMoney = 0;
                count++;

            }

        }
        System.out.printf("%d",count);
    }
}
