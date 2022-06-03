package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArrays = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        topInteger(numbersArrays);

    }
    public static void topInteger (int [] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            int count = 0;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    count++;
                }else {
                    break;
                }

            }
            if ( count == numbers.length-1-i){
                System.out.printf("%d ",numbers[i]);
            }

        }
        System.out.printf("%d ",numbers[numbers.length-1]);
    }
}
