package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = EvenAndOddSubtraction(scanner);
        System.out.println(sum);

    }
    public static int EvenAndOddSubtraction(Scanner scanner){
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] % 2 ==0 ){
                evenSum+=numbers[i];
            }else{
                oddSum+=numbers[i];
            }
        }
        return evenSum - oddSum ;
    }
}
