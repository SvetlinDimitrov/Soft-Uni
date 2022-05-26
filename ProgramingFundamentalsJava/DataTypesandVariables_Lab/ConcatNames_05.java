package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sign = scanner.nextLine();
        String middleName = scanner.nextLine();
        System.out.printf("%s%s%s",name,middleName,sign);
    }
}
