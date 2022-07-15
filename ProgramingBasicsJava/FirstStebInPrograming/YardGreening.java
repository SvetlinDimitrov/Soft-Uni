package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double kv = Double.parseDouble(scanner.nextLine()) ;
        double cena = kv * 7.61 ;
        double ots = (cena*18)/100 ;
        double krainaCena = cena - ots ;




        System.out.println("The final price is: "+ krainaCena +" lv."
        + "\n" + "The discount is:"+  ots +" lv." ) ;

    }
}
