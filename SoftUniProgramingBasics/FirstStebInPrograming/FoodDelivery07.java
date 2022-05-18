package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double pile = Double.parseDouble(scanner.nextLine()) ;
        double riba = Double.parseDouble(scanner.nextLine());
        double vegan = Double.parseDouble(scanner.nextLine()) ;
        double pileC = pile * 10.35 ;
        double ribaC = riba * 12.40 ;
        double veganC = vegan * 8.15 ;
        double obshto = pileC +ribaC + veganC ;
        double desertC = (obshto*20)/100 ;
        double dostavkaC = 2.50 ;
        double finala = obshto + desertC + dostavkaC ;
        System.out.println(finala) ;

    }
}
