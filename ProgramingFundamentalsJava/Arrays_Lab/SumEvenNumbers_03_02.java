package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumEvenNumbers(scanner);

    }
    public static void  SumEvenNumbers (  Scanner scanner) {
        int [] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0){
                sum+=number[i];
            }
        }
        System.out.println(sum);
    }
}
