package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            boolean bigger = true ;

            for (int j = i +1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    bigger = false;
                    break;
                }

                }
            if (bigger){
                System.out.printf("%d ",numbers[i]);
            }

        }

    }
}
