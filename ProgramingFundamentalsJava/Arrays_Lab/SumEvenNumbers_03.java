package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0){
                sum+= numbersArray[i];
            }

        }
        System.out.println(sum);

//        String [] array = scanner.nextLine().split(" ");
//        int len = array.length;
//        int [] intArray = new int[len];
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            intArray [i] = Integer.parseInt(array[i]);
//            if (intArray[i] % 2 ==0){
//                sum +=intArray[i];
//            }
//        }
//        System.out.println(sum);
    }
}
