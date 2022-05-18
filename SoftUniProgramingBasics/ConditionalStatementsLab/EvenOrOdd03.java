package SoftUniProgramingBasics.ConditionalStatementsLab;

import java.util.Scanner;

public class EvenOrOdd03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in) ;
        int Chislo = Integer.parseInt(scanner.nextLine());
        if (Chislo % 2 == 0 ) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
