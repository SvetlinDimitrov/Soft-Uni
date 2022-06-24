package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_05;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        double sumBonus = 0;
        int maxAttendance = 0;
        for (int i = 1; i <=students ; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            sumBonus =  (attendances*1.0 / numLectures) * (5 + bonus) ;
            if(maxBonus < sumBonus){
                maxBonus = sumBonus;
                maxAttendance = attendances;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n",maxBonus);
        System.out.printf("The student has attended %d lectures.",maxAttendance);
    }
}
