package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int prime = 0;
        int nonPrime = 0;
        int count = 0 ;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                number = Integer.parseInt(input);
            }
            count=0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if ( count <= 2){
                prime += number;

            }else {
                nonPrime += number;
            }

                input = scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);

    }
}
