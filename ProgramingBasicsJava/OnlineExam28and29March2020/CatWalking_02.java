package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minuteWalk = Integer.parseInt(scanner.nextLine());
        int numberwalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        double Allwalk = minuteWalk * numberwalks;
        double caloriesBurn = Allwalk * 5;

        if ( calories/2.0 <= caloriesBurn){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.",caloriesBurn);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",caloriesBurn);
        }
    }
}
// На първия ред - минути разходка на ден - цяло число в интервала [1...50]
// На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
// На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]