package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class CourierExpress_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String wayToDeliver = scanner.nextLine();
        int km = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double express = 0;
        double expressKm = 0;
        double End = 0;

        switch (wayToDeliver) {
            case "standard":
                if (weight < 1) {
                    price = 0.03;
                } else if (weight < 10) {
                    price = 0.05;
                } else if (weight < 40) {
                    price = 0.10;
                } else if (weight < 90) {
                    price = 0.15;
                } else {
                    price = 0.20;
                }
                break;
            case "express":
                if (weight < 1) {
                    price = 0.03;
                    express = price * 0.8;
                    expressKm = weight * express;
                } else if (weight < 10) {
                    price = 0.05;
                    express = price * 0.4;
                    expressKm = weight * express;
                } else if (weight < 40) {
                    price = 0.10;
                    express = price * 0.05;
                    expressKm = weight * express;
                } else if (weight < 90) {
                    price = 0.15;
                    express = price * 0.02;
                    expressKm = weight * express;
                } else {
                    price = 0.20;
                    express = price * 0.01;
                    expressKm = weight * express;
                }
                break;
        }
        if (wayToDeliver.equals("standard")) {
            End = km * price;
        } else {
            End = (price * km) + (expressKm*km);
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,End);
    }
}
