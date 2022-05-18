package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WeekendOrWorkingDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("Working day");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Error");
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            System.out.println("Working day");
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Error");
        }
    }
}