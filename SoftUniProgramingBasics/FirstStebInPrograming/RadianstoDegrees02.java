package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class RadianstoDegrees02 {
    public static void main (String[] arguments ){
        Scanner scanner = new Scanner(System.in) ;
        double rad = Double.parseDouble(scanner.nextLine()) ;
        double angle = (rad * 180)/Math.PI ;
        System.out.print(angle) ;
    }
}
