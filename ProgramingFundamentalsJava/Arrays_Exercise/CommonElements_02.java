package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String secondWords : secondArray){
            for (String firstWords : firstArray){
                if ( secondWords.equals(firstWords)){
                    System.out.printf("%s ",secondWords);
                }
            }
        }
    }
}
