package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class SuppliesforSchool05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in) ;
        int paketHimikali = Integer.parseInt(scanner.nextLine()) ;
        int paketMarkeri  = Integer.parseInt(scanner.nextLine()) ;
        int preparat = Integer.parseInt(scanner.nextLine()) ;
        double procentNamalenie = (Double.parseDouble(scanner.nextLine())/100 ) ;
        double cenaH = paketHimikali * 5.80;
        double cenaM = paketMarkeri * 7.20 ;
        double cenaP = preparat * 1.20 ;
        double cenaAll = cenaH +cenaM + cenaP ;
        double cenaNamalnie = cenaAll - (cenaAll * procentNamalenie ) ;
        System.out.println(cenaNamalnie);

    }
}
