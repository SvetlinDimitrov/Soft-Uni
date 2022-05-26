package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= times; i++) {
                int singleNumber = 0;
                int sum = 0;
            for (int j = i; j >0 ; j/=10 ) {
                singleNumber = j %10;
                sum +=singleNumber;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n",i);
            }else{
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
//A number is special when its sum of digits is 5, 7, or 11.