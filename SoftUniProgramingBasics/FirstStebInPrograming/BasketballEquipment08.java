package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class BasketballEquipment08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the goshisna taksa pls :") ;
        double godishnaTaksa = Double.parseDouble(scanner.nextLine());
        double kecove = godishnaTaksa - (godishnaTaksa*40/100) ;
        double ekip = kecove - ( kecove*20/100) ;
        double topka = ekip * 1/4 ;
        double aksesuari = topka *1/5 ;
        double finala = kecove + ekip + topka + aksesuari + godishnaTaksa ;
        System.out.println(finala ) ;
    }
}
