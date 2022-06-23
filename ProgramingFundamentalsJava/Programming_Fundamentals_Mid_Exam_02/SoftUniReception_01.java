package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employer1 = Integer.parseInt(scanner.nextLine());
        int employer2 = Integer.parseInt(scanner.nextLine());
        int employer3 = Integer.parseInt(scanner.nextLine());
        int sumEmployers = employer1+employer2+employer3;
        int studentsHours = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while(studentsHours > 0){
            count++;
            if(count % 4 !=0) {
                studentsHours -= sumEmployers;
            }

        }
        System.out.printf("Time needed: %dh.",count);
    }
}
