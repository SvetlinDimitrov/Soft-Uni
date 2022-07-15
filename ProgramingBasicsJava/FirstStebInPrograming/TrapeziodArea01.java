package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class TrapeziodArea01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double finala = (b1+b2) *h/2;
        System.out.printf("%.2f%n",finala);
    }
}
