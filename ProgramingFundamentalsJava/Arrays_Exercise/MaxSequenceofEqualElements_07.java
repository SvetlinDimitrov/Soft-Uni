package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int copyNumber = 0;

        for (int i = numbers.length-1; i >= 0 ; i--) {
            int count = 0;

            for (int j = i; j >= 0 ; j--) {
                if(numbers[i] != numbers[j]){
                    break;
                }else if(numbers[i] == numbers[j]){
                    count++;
                    if(count >= maxCount){
                        maxCount = count;
                        copyNumber = numbers[i];
                    }
                }

            }

        }
        int [] showLetters = new int [maxCount];
        Arrays.fill(showLetters , copyNumber);
        for (int num : showLetters){
            System.out.printf("%d ",num);
        }
    }
}
