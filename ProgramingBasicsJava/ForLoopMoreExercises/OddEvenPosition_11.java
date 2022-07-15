package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class OddEvenPosition_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double sumEven = 0;
        double sumOdd = 0;
        double EvenMax = Integer.MIN_VALUE;
        double EvenMin = Integer.MAX_VALUE;
        double OddMax = Integer.MIN_VALUE;
        double OddMin = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double numbers = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += numbers;
                if (EvenMax < numbers) {
                    EvenMax = numbers;
                }
                if (EvenMin > numbers) {
                    EvenMin = numbers;
                }
            } else {
                sumOdd += numbers;
                if (OddMax < numbers) {
                    OddMax = numbers;
                }
                if (OddMin > numbers) {
                    OddMin = numbers;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", sumOdd);
        if (OddMin == Integer.MAX_VALUE) {
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", OddMin);
        }
        if (OddMax == Integer.MIN_VALUE) {
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", OddMax);
        }


        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if (EvenMin == Integer.MAX_VALUE) {
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
        }
        if (EvenMax == Integer.MIN_VALUE) {
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("EvenMax=%.2f%n", EvenMax);
        }
    }
}