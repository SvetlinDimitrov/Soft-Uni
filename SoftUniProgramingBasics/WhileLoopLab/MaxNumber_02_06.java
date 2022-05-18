package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber_02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int BigNumber = Integer.MIN_VALUE;
        while (!number.equals("Stop")){
            int  sum = Integer.parseInt(number);
            if ( sum > BigNumber){
                BigNumber = sum;
            }
            number= scanner.nextLine();
        }
        System.out.printf("%d",BigNumber);
    }
}
