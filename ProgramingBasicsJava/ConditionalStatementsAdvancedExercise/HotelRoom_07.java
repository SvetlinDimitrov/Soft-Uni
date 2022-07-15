package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightNumber = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;
        switch (month) {
            case "May":
            case "October":
                studio += 50;
                apartment += 65;
                break;
            case "July":
            case "August":
                studio += 76;
                apartment += 77;
                break;
            case "September":
            case "June":
                studio += 75.20;
                apartment += 68.70;
                break;
        }
        if ((nightNumber > 7 && nightNumber < 14) && (month.equals("May") || month.equals("October"))) {
            studio = studio - (studio * 0.05);
        }else if ( nightNumber > 14 && (month.equals("May") || month.equals("October"))) {
            studio = studio - (studio * 0.3);
            apartment = apartment - (apartment * 0.1);
        }else if ( nightNumber > 14 && (month.equals("June") || month.equals("September"))) {
            studio = studio - (studio * 0.2);
            apartment = apartment - (apartment * 0.1);
        }else if( nightNumber > 14 ) {
             apartment = apartment - (apartment * 0.1);
        }
        System.out.printf("Apartment: %.2f lv.\n",nightNumber * apartment) ;
        System.out.printf("Studio: %.2f lv.", nightNumber * studio) ;
    }
}
//•	На първия ред е месецът – May, June, July, August, September или October
//•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]

//•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

//•	На първия ред: “Apartment: {цена за целият престой} lv.”
//•	На втория ред: “Studio: {цена за целият престой} lv.“