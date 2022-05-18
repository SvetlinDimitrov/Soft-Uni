package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int n = year - 1800 ;
        int years = 18;

        for ( int i = 0 ; i <= n ; i++){
            years+=i;
            if (i % 2 ==0){
                money = money - 12000 ;
            }else {
                money = money - (12000 + (50* years));
            }
        }
        if ( money > 0 ){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money ) ;
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
//•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
//•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]