package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0 ;
        day = day -1 ;
        switch (room) {
            case "room for one person":
                price = day * 18 ;
                break;
            case "apartment":
                price = day *25 ;
                if (day < 10) {
                    price = price  - (price * 0.3) ;

                }else if (day > 10 && day <= 15 ) {
                    price = price  - (price * 0.35) ;
                }else {
                    price = price  - (price * 0.5) ;
                }
                break;
            case "president apartment":
                price = day *35 ;
                if (day < 10) {
                    price = price  - (price * 0.1) ;

                }else if (day > 10 && day <= 15 ) {
                    price = price  - (price * 0.15) ;
                }else {
                    price = price  - (price * 0.2) ;
                }
                break;
        }
        if (rating.equals("positive")) {
            price = price  + (price * 0.25) ;
        }else {
            price = price  - (price * 0.1) ;
        }
        System.out.printf("%.2f",price);
    }
}

//•	Първи ред - дни за престой - цяло число в интервала [0...365]
//•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//•	Трети ред - оценка - "positive"  или "negative"

//	"room for one person" – 18.00 лв за нощувка
//        	"apartment" – 25.00 лв за нощувка
//        	"president apartment" – 35.00 лв за нощувка
