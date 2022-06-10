package ProgramingFundamentalsJava.Methods_Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = Long.parseLong(scanner.nextLine());
        long num2 = Long.parseLong(scanner.nextLine());
        System.out.printf("%.2f",FactionNumber(num1)*1.0/FactionNumber(num2));

    }
    public static long FactionNumber (long num){
        long sum = 1;
        for (int i = 1; i <= num ; i++) {
            sum*=i;
        }
        return sum;
    }
}
