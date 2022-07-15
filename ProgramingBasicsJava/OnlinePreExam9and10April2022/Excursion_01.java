package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int subway = Integer.parseInt(scanner.nextLine());
        int museum = Integer.parseInt(scanner.nextLine());


        double sumOnePerson = 20 * nights ;
        double subwaySum = subway * 1.6;
        double museumOne = museum * 6 ;
        double All = peopleNumber * ( sumOnePerson + subwaySum + museumOne);
        All = All + ( All * 0.25);

        System.out.printf("%.2f",All);

    }
}
//1. Броят на хората в групата – цяло число в интервала [0 … 50]
//2. Броят на нощувките – цяло число в интервала [0 … 2000]
//3. Броят на картите за транспорт – цяло число в интервала [0… 2000]
//4. Броят на билетите за музеи – цяло число в интервала [0 … 2000]

//Нощувка - 20 лв.
// Карта за транспорт - 1.60 лв.
// Билет за музей - 6 лв.