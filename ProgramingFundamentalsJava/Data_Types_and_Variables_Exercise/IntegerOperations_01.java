package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());
        int fourN = Integer.parseInt(scanner.nextLine());
        int sum = ((firstN + secondN) /thirdN)*fourN;
        System.out.println(sum);
    }
}
