package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_06;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int plunderDay = Integer.parseInt(scanner.nextLine());
        int finalPlunder = Integer.parseInt(scanner.nextLine());
        double sumGather = 0;

        for (int i = 1; i <= times; i++) {
            if (i % 3 == 0) {
                sumGather += plunderDay + (plunderDay * 0.5);
            } else if (i % 5 == 0) {
                sumGather += plunderDay;
                sumGather -= sumGather * 0.3;
            }else {
                sumGather += plunderDay;
            }
        }
        if (sumGather >= finalPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumGather);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (sumGather / finalPlunder) * 100);
        }
    }
}
