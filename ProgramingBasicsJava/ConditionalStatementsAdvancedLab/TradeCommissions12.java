package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commissions;
        switch (city) {
            case "Sofia":
                if (0 <= sells && sells <= 500) {
                    commissions = sells * 0.05;
                    System.out.printf("%.2f", commissions);
                } else if (500 < sells && sells <= 1000) {
                    commissions = sells * 0.07;
                    System.out.printf("%.2f", commissions);
                } else if (1000 < sells && sells <= 10000) {
                    commissions = sells * 0.08;
                    System.out.printf("%.2f", commissions);
                } else if (sells > 1000) {
                    commissions = sells * 0.12;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (0 <= sells && sells <= 500) {
                    commissions = sells * 0.045;
                    System.out.printf("%.2f", commissions);
                } else if (500 < sells && sells <= 1000) {
                    commissions = sells * 0.075;
                    System.out.printf("%.2f", commissions);
                } else if (1000 < sells && sells <= 10000) {
                    commissions = sells * 0.1;
                    System.out.printf("%.2f", commissions);
                } else if (sells > 1000) {
                    commissions = sells * 0.13;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (0 <= sells && sells <= 500) {
                    commissions = sells * 0.055;
                    System.out.printf("%.2f", commissions);
                } else if (500 < sells && sells <= 1000) {
                    commissions = sells * 0.08;
                    System.out.printf("%.2f", commissions);
                } else if (1000 < sells && sells <= 10000) {
                    commissions = sells * 0.12;
                    System.out.printf("%.2f", commissions);
                } else if (sells > 1000) {
                    commissions = sells * 0.145;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
