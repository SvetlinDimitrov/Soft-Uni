package ProgramingFundamentalsJava.Lab_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        BigInteger fac = BigInteger.valueOf(num);
        System.out.println(BigFac(num, fac));
    }

    private static BigInteger BigFac(int num, BigInteger fac) {
        if (num <= 0) {
            return BigInteger.valueOf(1) ;
        }
        return fac.multiply(BigFac(num-1 , fac.subtract(BigInteger.ONE)));
    }
}
