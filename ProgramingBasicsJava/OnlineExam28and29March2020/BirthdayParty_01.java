package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());

        double tort = sum * 0.2;
        double drinks = tort - ( tort * 0.45);
        double anime = sum / 3;

        double All = sum +tort + drinks + anime ;
        System.out.printf("%.1f",All);
    }
}
