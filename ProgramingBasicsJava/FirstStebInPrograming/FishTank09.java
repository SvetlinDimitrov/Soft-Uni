package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class FishTank09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in) ;
        double dulgo = Double.parseDouble(scanner.nextLine()) ;
        double shirko = Double.parseDouble(scanner.nextLine()) ;
        double visoko = Double.parseDouble(scanner.nextLine()) ;
        double procent = Double.parseDouble(scanner.nextLine()) /100 ;
        double sbor = dulgo * shirko * visoko ;
        double obemLitri = sbor/1000 ;
        double prostranstvo = obemLitri * (1 - procent) ;
        System.out.println(prostranstvo);

    }
}
