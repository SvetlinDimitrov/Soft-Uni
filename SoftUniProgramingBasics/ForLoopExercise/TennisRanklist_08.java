package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int pointsBegin = Integer.parseInt(scanner.nextLine());
        double wins = 0 ;
        int winsPoints = 0 ;
        int Ffpoints = 0 ;
        int Sfpoints = 0;
        for (int i = 1 ; i<=n ; i ++){
            String positions = scanner.nextLine();
            switch (positions) {
                case "W" :
                    pointsBegin +=2000 ;
                    wins +=1 ;
                    winsPoints +=2000;
                    break;
                case "F" :
                    Ffpoints +=1200;
                    pointsBegin +=1200 ;
                    break;
                case "SF" :
                    Sfpoints +=720 ;
                    pointsBegin +=720 ;
                    break;

            }
        }
        System.out.printf("Final points: %d%n",pointsBegin);
        System.out.printf("Average points: %d%n",(winsPoints+Ffpoints + Sfpoints)/n);
        System.out.printf("%.2f%%",wins/n*100);
    }
}
//•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
//•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
//За всеки турнир се прочита отделен ред:
//•	Достигнат етап от турнира – текст – "W", "F" или "SF"

//	W - ако е победител получава 2000 точки
//	F - ако е финалист получава 1200 точки
//	SF - ако е полуфиналист получава 720 точки