package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in) ;
        int nailon = Integer.parseInt(scanner.nextLine()) ;
        double boq = Double.parseDouble(scanner.nextLine()) ;
        int razreditel = Integer.parseInt(scanner.nextLine()) ;
        int chasove = Integer.parseInt(scanner.nextLine()) ;
        double sumaN = (nailon + 2) *1.50 ;
        double sumaB = ((boq*10/100) + boq ) *  14.50 ;
        double sumaR = razreditel * 5.00 ;
        double sumT = 0.40 ;
        double obshto = sumaN + sumaB + sumaR + sumT;
        double sumaMaistor = ((obshto *30)/100 ) * chasove ;
        double finala = obshto + sumaMaistor ;
        System.out.println(finala);

    }
}
