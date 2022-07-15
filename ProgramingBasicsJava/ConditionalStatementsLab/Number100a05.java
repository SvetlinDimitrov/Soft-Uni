package SoftUniProgramingBasics.ConditionalStatementsLab;

import java.util.Scanner;

public class Number100a05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = Integer.parseInt(scanner.nextLine());
        if (chislo < 100) {
            System.out.println("Less than 100");

        } else if (chislo <= 200) {
            System.out.println("Between 100 and 200");

        } else   {
            System.out.println("Greater than 200");

        }
    }
}
