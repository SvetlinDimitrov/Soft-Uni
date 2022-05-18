package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String look = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean flag = false;

        switch (city) {
            case "Bansko":
            case "Borovets":
                if (look.equals("noEquipment")) {
                    price = 80;
                    if (vip.equals("yes")) {
                        price = price - (price * 0.05);
                    }
                } else if (look.equals("withEquipment")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - (price * 0.1);
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (look.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - (price * 0.7);
                    }
                } else if (look.equals("withBreakfast")) {
                    price = 130;
                    if (vip.equals("yes")) {
                        price = price - (price * 0.12);
                    }
                }
                break;
            default:
                flag = true;
        }
        if (days > 7) {
            days = days - 1;
        }
        price = price * days;
        if (flag) {
            System.out.println("Invalid input!");
        } else if(days <= 0) {
            System.out.println("Days must be positive number!");
        }else{
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }
    }
}
//1.	Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
//2.	Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
//3.	Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
//4.	Дни за престой - цяло число в интервала [1 … 10000]