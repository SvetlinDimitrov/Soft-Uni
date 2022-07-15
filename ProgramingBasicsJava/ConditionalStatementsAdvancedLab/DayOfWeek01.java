package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        if (day <= 7) {
            if (day == 1) {
                System.out.println("Monday");
            }
            if (day == 2) {
                System.out.println("Tuesday");
            }
            if (day == 3) {
                System.out.println("Wednesday");
            }
            if (day == 4) {
                System.out.println("Thursday");
            }
            if (day == 5) {
                System.out.println("Friday");
            }
            if (day == 6) {
                System.out.println("Saturday");
            }
            if (day == 7) {
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Error");
        }
    }
}

//        switch (day) {
//            case 1 :
//                System.out.println("Monday") ;
//                break ;
//            case 2 :
//                System.out.println("Tuesday") ;
//                break ;
//            case 3 :
//                System.out.println("Wednesday") ;
//                break ;
//            case 4 :
//                System.out.println("Thursday") ;
//                break ;
//            case 5 :
//                System.out.println("Friday") ;
//                break ;
//            case 6 :
//                System.out.println("Saturday") ;
//                break ;
//            case 7 :
//                System.out.println("Sunday") ;
//                break ;
//            default:
//                System.out.println("Error") ;
//
//        }
 //   }
//}
