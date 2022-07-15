package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double maxSeats = r * c ;
        double maxValue = 0 ;
        switch (ticket) {
            case "Premiere" :
                maxValue = maxSeats * 12 ;
                break;
            case "Normal":
                maxValue = maxSeats * 7.50 ;
                break;
            case "Discount" :
                maxValue = maxSeats * 5 ;
                break;
        }
        System.out.printf("%.2f leva",maxValue );
    }
}
