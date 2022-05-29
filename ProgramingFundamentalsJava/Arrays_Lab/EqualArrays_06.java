package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] firstLine = scanner.nextLine().split(" ");
//        String[] secondLine = scanner.nextLine().split(" ");
//        int[] firstNumbers = new int[firstLine.length];
//        int[] secondNumbers = new int[secondLine.length];
//        boolean flag = false;
//        int sum = 0;
//
//        for (int i = 0; i < firstLine.length; i++) {
//            firstNumbers[i] = Integer.parseInt(firstLine[i]);
//            secondNumbers[i] = Integer.parseInt(secondLine[i]);
//            if (firstNumbers[i] != secondNumbers[i]) {
//                flag = true;
//                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
//                break;
//            }
//            sum += firstNumbers[i];
//
//        }
//        if (!flag) {
//            System.out.printf("Arrays are identical. Sum: %d", sum);
//
//        }

        int[] firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        int sum = 0;

        for (int i = 0; i < firstNumbers.length; i++) {
            if ( firstNumbers[i] != secondNumbers[i]){
                flag = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }else {
                sum+=firstNumbers[i];
            }
        }
        if(flag){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
