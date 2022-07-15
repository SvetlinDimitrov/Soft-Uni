package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class Oscars_while_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while(i<=n){
            String nameJudge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
            int pointsName = nameJudge.length();
            points+= (pointsName * pointsJudge)/2;
            i++;
            if ( points > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,points);
                break;
            }
        }
        if (points < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",name,1250.5-points);
        }
    }
}
