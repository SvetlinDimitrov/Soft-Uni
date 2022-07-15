package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class USDtoBGN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in) ;
        double usb = Double.parseDouble(scanner.nextLine()) ;
        double bgn = usb * 1.79549 ;
        double pari = 2;
        int chasha = 5 ;
        double kotka = chasha / pari ;
        System.out.println(kotka) ;
System.out.println( bgn);
    }
}
