package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class MaidenParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetParty = Double.parseDouble(scanner.nextLine());
        int love = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int lucky = Integer.parseInt(scanner.nextLine());
        int All = love + roses + keys + pictures + lucky ;

        double lovePay = love * 0.6;
        double rosesPay = roses * 7.2;
        double keysPay = keys * 3.6;
        double picturePay = pictures * 18.2;
        double luckyPay = lucky * 22;
        double AllPay = lovePay + rosesPay + keysPay + picturePay + luckyPay;

        if ( All >= 25){
            AllPay = AllPay - (AllPay * 0.35);
        }

        AllPay = AllPay - ( AllPay * 0.1);

        if ( AllPay > budgetParty){
            System.out.printf("Yes! %.2f lv left.",AllPay - budgetParty);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",budgetParty - AllPay);
        }

    }
}
//•	Любовно послание - 0.60 лв.
//•	Восъчна роза - 7.20 лв.
//•	Ключодържател - 3.60 лв.
//•	Карикатура - 18.20 лв.
//•	Късмет изненада - 22 лв.

//1.	Цена на моминското парти - реално число в интервала [1.00 … 10000.00]
//2.	Брой любовни послания - цяло число в интервала [0… 1000]
//3.	Брой восъчни рози - цяло число в интервала [0 … 1000]
//4.	Брой ключодържатели - цяло число в интервала [0 … 1000]
//5.	Брой карикатури - цяло число в интервала [0 … 1000]
//6.	Брой късмети изненада - цяло число в интервала [0 … 1000]