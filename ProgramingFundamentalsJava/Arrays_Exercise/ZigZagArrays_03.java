package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] saveOne = new String[n];
        String[] saveTwo = new String[n];

        for (int i = 0; i < n; i++) {
            String[] inputArray = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                saveOne[i] = inputArray[0];
                saveTwo[i] = inputArray[1];
            } else {
                saveOne[i] = inputArray[1];
                saveTwo[i] = inputArray[0];

            }
        }
        for ( String firstWords : saveOne){
            System.out.printf("%s ",firstWords);
        }
        System.out.println();
        for (String secondWords : saveTwo){
            System.out.printf("%s ",secondWords);
        }
    }
}
