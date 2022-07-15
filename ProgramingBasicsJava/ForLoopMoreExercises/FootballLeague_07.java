package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        for ( int i =1 ; i <=fans ; i++){
            String sector = scanner.nextLine();
            switch (sector){
                case "A" :
                    p1+=1;
                    break;
                case "B" :
                    p2+=1;
                    break;
                case "V" :
                    p3+=1;
                    break;
                case "G" :
                    p4+=1;
                    break;

            }
        }

        System.out.printf("%.2f%%%n",(p1/fans)*100);
        System.out.printf("%.2f%%%n",(p2/fans)*100);
        System.out.printf("%.2f%%%n",(p3/fans)*100);
        System.out.printf("%.2f%%%n",(p4/fans)*100);
        System.out.printf("%.2f%%%n",(fans*1.0/capacity)*100);
    }
}
//1.	Секторът, на който се намира – текст – "A", "B", "V" и "G".