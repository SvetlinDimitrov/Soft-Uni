package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class VegetableMarket04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Zelenchuci = Double.parseDouble(scanner.nextLine());
        Double plodove = Double.parseDouble(scanner.nextLine());
        Double cenaZele = Double.parseDouble(scanner.nextLine());
        Double cenaPlod = Double.parseDouble(scanner.nextLine());
        Double finala = ((Zelenchuci *cenaZele) + (plodove*cenaPlod))/1.94 ;
        System.out.printf("%.2f%n",finala) ;

    }
}
