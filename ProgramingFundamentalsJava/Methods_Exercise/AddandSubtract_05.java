package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class AddandSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(FinalResult(Sum(number1 , number2),number3));
    }
    public static int Sum (int num1 , int num2){
        return num1 +num2;
    }
    public  static int FinalResult (int sum , int num3 ){
        return sum - num3;
    }
}
