package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String planName = scanner.nextLine();
        int ticketOld = Integer.parseInt(scanner.nextLine());
        int ticketChild = Integer.parseInt(scanner.nextLine());
        double priceOld = Double.parseDouble(scanner.nextLine());
        double payServes = Double.parseDouble(scanner.nextLine());

        double priceChild = priceOld - (priceOld *0.7);
        double old = priceOld + payServes ;
        double child = priceChild + payServes;
        double all = (ticketChild * child) + (ticketOld * old);

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",planName,all*0.2);
    }
}
//золата се четат 5 реда:
//1. Име на авиокомпанията - текст
//2. Брой билети за възрастни – цяло число в диапазона [1…400]
//3. Брой детски билети – цяло число в диапазона [25…120]
//4. Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
//5. Цената на такса обслужване - реално число в диапазона [10.0…50.0]