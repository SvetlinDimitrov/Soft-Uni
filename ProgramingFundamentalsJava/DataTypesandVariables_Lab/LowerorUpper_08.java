package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class LowerorUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        if ((int) letter >= 65 && (int) letter <=90){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
