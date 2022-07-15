package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double entryPay = Double.parseDouble(scanner.nextLine());
        double Price1 = Double.parseDouble(scanner.nextLine());
        double Price2 = Double.parseDouble(scanner.nextLine());

        double payentry = people * entryPay ;
        double payprice1 = Math.ceil(people *0.75 ) * Price1;
        double payprice2 = Math.ceil(people *0.5) * Price2;

        System.out.printf("%.2f lv.",payentry + payprice2 + payprice1);
    }
}
