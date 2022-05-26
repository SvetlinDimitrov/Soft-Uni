package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i <times ; i++) {
            BigDecimal signeNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(signeNumber);
        }
        System.out.printf("%s",sum);
    }
}
