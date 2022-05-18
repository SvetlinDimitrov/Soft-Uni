package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimefortheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrive = Integer.parseInt(scanner.nextLine());
        int minutesArrive = Integer.parseInt(scanner.nextLine());
        double minutesAllExam = (hourExam * 60) + minutesExam;
        double minutesAllArrive = (hourOfArrive * 60) + minutesArrive;
        double minutesLeft = Math.abs(minutesAllArrive - minutesAllExam);
        boolean lateEarly = minutesAllArrive > minutesAllExam  ;
        boolean onTime = (minutesAllArrive <= minutesAllExam) && (minutesLeft <= 30) ;
        boolean onTimePerfect = (minutesAllArrive == minutesAllExam) ;
        if (lateEarly && minutesLeft <=59 ) {
            System.out.printf("Late\n" + "%.0f minutes after the start",minutesLeft %60 );
        } else if (lateEarly) {
            System.out.printf("Late\n" + "%.0f:%.0f hours after the start",Math.floor(minutesLeft/60),minutesLeft %60 );
        }else if (onTime) {
            System.out.printf("On time\n" + "%.0f minutes before the start", minutesLeft %60);
        }else if (onTimePerfect) {
            System.out.println("On time");
        }else if ( !lateEarly && minutesLeft <=59) {
            System.out.printf("Early\n" + "%.0f minutes before the start" , minutesLeft %60) ;
        }else if (!lateEarly){
            System.out.printf("Early\n" + "%.0f:%.0f hours before the start",minutesLeft/60 , minutesLeft %60) ;
        }

    }
}


//        if ( (minutesAllArrive < minutesAllExam) && minutesAllArrive >30 ){
//            System.out.printf("Early\n" + "%.0f:%.0f hours before the start",minutesLeft/60 , minutesLeft %60) ;
//            if (minutesAllArrive <= 30) {
//                System.out.printf("On time\n" + "%.0f hours before the start", minutesLeft %60) ;
//            }
//
//        }else if (Zero) {
//            System.out.println("On time") ;
//        }else if (minutesAllArrive > minutesAllExam && minutesLeft >= 60 ) {
//            System.out.printf("Late\n" + "%.0f:%.0f hours after the start",minutesLeft/60,minutesLeft %60 );
//        }else {
//        System.out.printf("Late\n" + "%.0f hours after the start",minutesLeft %60 );
//•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
//•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.