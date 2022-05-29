package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        

        for (int i = 0; i < arrayNumbers.length-1; i++) {
            for (int j = 0; j < arrayNumbers.length-1; j++) {
                arrayNumbers[j] = arrayNumbers[j] + arrayNumbers[j+1];
                
            }
        }
        System.out.println(arrayNumbers[0]);
    }
}
