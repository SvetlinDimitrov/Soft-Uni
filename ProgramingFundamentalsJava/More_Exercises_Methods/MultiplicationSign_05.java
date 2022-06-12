package ProgramingFundamentalsJava.More_Exercises_Methods;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Indicator(numbers));

    }

    public static String Indicator(int[] num) {
        boolean isNegative = false;
        boolean isZero = false;
        String answer = "";

        if (num[0] < 0 || num[1] < 0 || num[2] < 0) {
            isNegative = true;
        }
        if (num[0] == 0 || num[1] == 0 || num[2] ==0){
            isZero = true;
        }

        if (isZero){
            answer = "zero";
        }else if ( isNegative){
            answer ="negative";
        }else {
           answer="positive";
        }
        return  answer;
    }
}
