package ProgramingFundamentalsJava.Methods_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        BigDecimal powNumber = new BigDecimal(MathPower(number , pow));
        System.out.printf("%s",powNumber);
    }
    public static double MathPower (double number , int pow){
        return (Math.pow(number , pow));
    }
}
