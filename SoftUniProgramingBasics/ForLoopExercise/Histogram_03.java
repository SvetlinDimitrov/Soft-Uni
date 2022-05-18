package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <= n; i++) {
            int Numbers = Integer.parseInt(scanner.nextLine());
            if (Numbers < 200) {
                p1 += 1;
            } else if (Numbers <=399){
                p2+= 1;
            }else if (Numbers <=599) {
                p3+=1;
            }else if (Numbers <=799){
                p4+=1;
            }else {
                p5+=1;
            }
        }
        p1 = p1/n * 100 ;
        p2 = p2/n * 100 ;
        p3 = p3/n * 100 ;
        p4 = p4/n * 100 ;
        p5 = p5/n * 100 ;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",p1 , p2 , p3,p4,p5);

    }
}
