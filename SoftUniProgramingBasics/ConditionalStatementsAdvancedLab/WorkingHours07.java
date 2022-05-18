package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WorkingHours07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if ( (hour >=10 && hour <=18) && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday"))){
            System.out.println("open");
        }else {
            System.out.println("closed") ;
        }
//        switch (day) {
//            case "Monday" :
//            case "Tuesday" :
//            case "Wednesday" :
//            case "Thursday" :
//            case "Friday" :
//            case "Saturday" :
//                if (hour >=10 && hour <=18) {
//                    System.out.println("open");
//                }else {
//                    System.out.println("closed");
//                }
//                break;
//            default:
//                System.out.println("closed");



        }
    }

//  време на офисът е от 10-18 часа, от понеделник до събота включително