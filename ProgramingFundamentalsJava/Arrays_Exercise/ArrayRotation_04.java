package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArray = scanner.nextLine().split(" ");
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
                String save = inputArray[0] ;
            for (int j = 0; j < inputArray.length -1; j++) {

                inputArray[j] = inputArray[j +1 ];

            }
            inputArray[inputArray.length-1] = save;

        }
        for (String wordsReverse : inputArray){
            System.out.printf("%s ",wordsReverse);
        }

    }
}
