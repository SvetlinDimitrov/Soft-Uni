package ProgramingFundamentalsJava.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double priceGame = 0;
        double spendMoney = money;
        boolean out = false;

        while (!game.equals("Game Time")) {

            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    if (money >= priceGame) {
                        money -= priceGame;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    priceGame = 15.99;
                    if (money >= priceGame) {
                        money -= priceGame;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    priceGame = 19.99;
                    if (money >= priceGame) {
                        money -= priceGame;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    priceGame = 59.99;
                    if (money >= priceGame) {
                        money -= priceGame;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    if (money >= priceGame) {
                        money -= priceGame;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }


            game = scanner.nextLine();
            if (money == 0) {
                out = true;
                break;
            }
        }
        if (out) {
            System.out.println("Out of mo-ney!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney - money, money);
        }
    }
}
