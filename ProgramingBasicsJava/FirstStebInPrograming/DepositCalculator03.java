package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depozit = Double.parseDouble(scanner.nextLine()) ;
        double depozitSrok = Double.parseDouble(scanner.nextLine()) ;
        double procent = Double.parseDouble(scanner.nextLine())/100 ;
        double lihva = depozit * procent ;
        double lihva1mesec = lihva / 12 ;
        double obshtasuma = depozit + (depozitSrok * lihva1mesec) ;
        System.out.println ( obshtasuma) ;

    }
}
