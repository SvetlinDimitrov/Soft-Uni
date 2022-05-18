package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMainActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false ;

        for (int i = 1; i <= n ; i++) {
            String nameJudge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
            pointsJudge = (nameJudge.length() * pointsJudge)/2;
            points+=pointsJudge ;
            if ( points > 1250.5) {
                flag = true;
                break;
            }

        }
        if ( flag){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameMainActor,points);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!",nameMainActor,1250.5-Math.abs(points));
        }
    }
}
