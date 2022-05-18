package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String nameJudge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
            double pointsJudgeByName = (nameJudge.length() * pointsJudge) / 2;
            points = points + pointsJudgeByName;
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
                break;
            }
        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - points);
        }
    }
}
//•	Име на актьора - текст
//•	Точки от академията - реално число в интервала [2.0... 450.5]
//•	Брой оценяващи n - цяло число в интервала[1… 20]
//На следващите n-на брой реда:
//o	Име на оценяващия - текст
//o	Точки от оценяващия - реално число в интервала [1.0... 50.0]