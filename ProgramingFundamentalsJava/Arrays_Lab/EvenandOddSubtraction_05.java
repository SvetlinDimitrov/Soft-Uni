package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String [] stringArray = scanner.nextLine().split(" ");
//        int [] allNumbers = new int [stringArray.length ] ;
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        for (int i = 0; i < stringArray.length; i++) {
//            allNumbers[i]= Integer.parseInt(stringArray[i]);
//            if (allNumbers[i] % 2 == 0){
//                sumEven+=allNumbers[i];
//            }else {
//                sumOdd+= allNumbers[i];
//            }
//
//        }
//        System.out.println(sumEven - sumOdd);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for(int numbers : numbersArray){
            if (numbers % 2 ==0){
                sumEven+=numbers;
            }else{
                sumOdd+= numbers;
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
// even - odd