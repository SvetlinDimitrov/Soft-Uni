package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean CheapDays = (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"));
        boolean ExpensiveDays = ((day.equals("Saturday") || day.equals("Sunday"))) ;
        if (CheapDays) {
            if (fruit.equals("banana")) {
                price = 2.50;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("apple")) {
                price = 1.20;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("orange")) {
                price = 0.85;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            }else {
                System.out.println("error");
            }
        }else if (ExpensiveDays) {
            if (fruit.equals("banana")) {
                price = 2.70;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("apple")) {
                price = 1.25;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("orange")) {
                price = 0.90;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                price = price * quantity;
                System.out.printf ("%.2f", price) ;
            }else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }

    }
}