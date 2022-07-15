package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class CelsiustoFahrenheit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double C = Double.parseDouble(scanner.nextLine());
        Double F = C *1.8 +32 ;
        System.out.printf("%.2f%n", F);
    }
}
