package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class CinemaTicket08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int price = 0;
//        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
//            price += 12;
//            System.out.println(price);
//        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
//            price += 14;
//            System.out.println(price);
//        } else if (day.equals("Saturday") || day.equals("Sunday")) {
//            price += 16;
//            System.out.println(price);
//        }
        switch (day) {
            case "Monday" :
            case "Tuesday" :
            case "Friday" :
                price+=12 ;
                break;
            case "Wednesday" :
            case "Thursday" :
                price+=14 ;
                break;
            case "Saturday":
            case "Sunday" :
                price+=16;
                break;
        } System.out.println(price);
    }
}