package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceThird = Double.parseDouble(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());
        int trip = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        if (km < 10) {
            priceThird = priceThird - (priceThird * 0.2);
        } else if (km <= 20) {
            priceThird = priceThird / 2;
        }

        if (trip < 7) {
            priceThird = priceThird + (priceThird * 0.4);
        } else if (trip <= 30) {
            priceThird = priceThird + (priceThird * 0.15);
        } else {
            priceThird = priceThird + (priceThird * 0.10);
        }

        System.out.printf("The total price of bags is: %.2f lv.",priceThird*number);
    }
}
//олата се четат 4 реда:
//1. Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
//2. Килограми на багажа – реално число в диапазона [1.0…32.0]
//3. Дни до пътуването – цяло число в диапазона [1…60]
//4. Брой багажи – цяло число в диапазона [1…10]