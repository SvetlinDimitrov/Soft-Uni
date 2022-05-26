package ProgramingFundamentalsJava.DataTypesandVariables_Lab;


import java.util.Scanner;

public class CenturiestoMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        double year = centuries * 100;
        double days = year * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;
        String output = String.format("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,year,days,hours,minutes);
        System.out.println(output);
    }
}
//1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes