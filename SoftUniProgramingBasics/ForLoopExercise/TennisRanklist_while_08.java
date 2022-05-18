package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_while_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int i = 1 ;
        int sum = 0;
        double victory = 0;
        while ( i<=n){
            String showGame = scanner.nextLine();
            switch(showGame){
                case "W" :
                    sum += 2000;
                    victory +=1 ;
                    break;
                case "F" :
                    sum += 1200;
                    break;
                case "SF" :
                    sum += 720;
                    break;
            }
            i++;
        }
        System.out.printf("Final points: %d%n",sum+points);
        System.out.printf("Average points: %d%n",(sum)/n);
        System.out.printf("%.2f%%",victory/n*100);
    }
}
//	W - ако е победител получава 2000 точки
//	F - ако е финалист получава 1200 точки
//	SF - ако е полуфиналист получава 720 точки