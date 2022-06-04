package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true ;
        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <= numbersArray.length-1 ; i++) {
            int currentNumber= numbersArray[i];
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j <i ; j++) {
                sum1+=numbersArray[j];
            }
            for (int j = numbersArray.length-1; j >i ; j--) {
                sum2+=numbersArray[j];
            }
            if (sum1 == sum2){
                System.out.println(i);
                flag = false;
                break;
            }
            if(sum1==0 && sum2==0){
                System.out.println(0);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("no");
        }
    }
}
