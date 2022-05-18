package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int numberPrime = 0;
        int numberComplex =0;

        while (!n.equals("stop")) {
            int number = Integer.parseInt(n);
            int count = 0;
            if ( number < 0){
                System.out.println("Number is negative.");
            }

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                if(number > 0) {
                    numberPrime += number;
                }
            }else if ( count >= 3){
                numberComplex += number;
            }

            n = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",numberPrime );
        System.out.printf("Sum of all non prime numbers is: %d%n",numberComplex );
    }
}
