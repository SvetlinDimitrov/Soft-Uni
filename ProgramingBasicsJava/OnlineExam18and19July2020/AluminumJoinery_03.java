package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        boolean flag = false;

        if (number < 10) {
            flag = true;
        }


        switch (name) {
            case "90X130":
                price = 110 * number;
                if (number > 30 && number <= 60) {
                    price = price - (price * 0.05);
                } else if (number > 60) {
                    price = price - (price * 0.08);
                }
                break;
            case "100X150":
                price = 140 *number;
                if (number > 40 && number <= 80) {
                    price = price - (price * 0.06);
                } else if (number > 80) {
                    price = price - (price * 0.1);
                }

                break;
            case "130X180":
                price = 190 *number;
                if (number > 20 && number <= 50) {
                    price = price - (price * 0.07);
                } else if (number > 50) {
                    price = price - (price * 0.12);
                }

                break;
            case "200X300":
                price = 250 * number;
                if (number > 25 && number <= 50) {
                    price = price - (price * 0.09);
                } else if (number > 50) {
                    price = price - (price * 0.14);
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            price = price + 60;
        }

        if (number > 99) {
            price = price - (price * 0.04);
        }

        if (flag) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", price);
        }
    }
}
//1. Брой дограми – цяло число в интервала [0..1000];
//2. Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
//3. Начин на получаване – текст
// С доставка - "With delivery"
// Без доставка - "Without delivery"