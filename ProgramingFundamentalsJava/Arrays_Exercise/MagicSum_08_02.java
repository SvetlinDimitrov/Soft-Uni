package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());
        magicRotation(numbers , magicNumber);
    }
    public static void magicRotation (int [] numbers , int magicNumber){
        for (int i = 0; i <= numbers.length-1 ; i++) {

            for (int j = i+1; j <= numbers.length-1; j++) {
                if ((numbers[i] + numbers[j]) == magicNumber){
                    System.out.printf("%d %d%n",numbers[i] , numbers[j]);
                }
            }

        }
    }
}
