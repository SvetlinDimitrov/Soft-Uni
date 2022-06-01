package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numberArray1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] numberArray2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        EqualArrays(numberArray1 , numberArray2);
    }
    public static void EqualArrays(int[]number , int [] number2){
        boolean flag = true;
        int sum = 0;
            for (int j = 0; j < number.length; j++) {
                if(number[j] != number2[j]){
                    flag = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.",j);
                    break;
                }
                sum+=number[j];
        }
            if(flag){
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
    }
}
