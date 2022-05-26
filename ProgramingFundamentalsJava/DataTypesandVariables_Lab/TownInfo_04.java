package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        int people = Integer.parseInt(scanner.nextLine());
//        int area = Integer.parseInt(scanner.nextLine());
        BigDecimal people = new BigDecimal(scanner.nextInt());
        BigDecimal area = new BigDecimal(scanner.nextInt());
        System.out.printf("Town %s has population of %s and area %s square km.",name , people , area);
    }
}
