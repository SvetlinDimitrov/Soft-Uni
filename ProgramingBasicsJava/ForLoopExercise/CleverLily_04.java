package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toy = 0 ;
        int money = 0 ;
        for ( int i = 1 ; i<=n ; i++){
            if ( i % 2 ==0 ){
                int moneyStack = 10 * ( i/2);
                money = money + moneyStack - 1;
            }else {
                toy= toy + 1 ;
            }
        }
        toy = toy * toyPrice ;
        money+=toy ;
        if (money > washingMachine ) {
            System.out.printf("Yes! %.2f", money - washingMachine );
        }else {
            System.out.printf("No! %.2f", washingMachine - money );
        }
    }
}
//•	Възрастта на Лили - цяло число в интервала [1...77]
//•	Цената на пералнята - число в интервала [1.00...10 000.00]
//•	Единична цена на играчка - цяло число в интервала [0...40]