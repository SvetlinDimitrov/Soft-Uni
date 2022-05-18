package SoftUniProgramingBasics.ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double point = Double.parseDouble(scanner.nextLine()) ;
        double bonus ;
        if (point <= 100) {
            bonus = 5 ;
        } else if ( point > 1000) {
            bonus = (point*10)/100 ;
        } else {
            bonus = (point *20) /100 ;

        }
        if (point % 2 == 0) {
            bonus = bonus + 1 ;
        } else if ( point % 10 == 5) {
            bonus = bonus +2 ;
        }
System.out.printf("%.1f%n",bonus) ;
        System.out.printf ( "%.1f%n" , bonus + point);
    }
}
//•	Ако числото е до 100 включително, бонус точките са 5.
     //   •	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
      //  •	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
//o	За четно число  + 1 т.
//        o	За число, което завършва на 5  + 2 т.
