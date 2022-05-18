package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in) ;
        double kucheOp = Double.parseDouble(scanner.nextLine()) ;
        double kotkaOp = Double.parseDouble(scanner.nextLine()) ;
        double kuche = kucheOp * 2.5 ;
        double kotka = kotkaOp * 4 ;
        System.out.println(kuche + kotka + " lv.") ;

    }
}
