package SoftUniProgramingBasics.ConditionalStatementsLab;

import java.util.Scanner;

public class GreaterNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FirstNumber = Integer.parseInt(scanner.nextLine()) ;
        int SecondNumber = Integer.parseInt(scanner.nextLine()) ;
        if (FirstNumber > SecondNumber) {
            System.out.print(FirstNumber);

        } else {
            System.out.println(SecondNumber);
        }
    }
}
