package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = Arrays(scanner);
        String [] secondArray = Arrays(scanner);
        compareArrays(firstArray , secondArray);


    }
    public static String[] Arrays (Scanner scanner ){
         return  scanner.nextLine().split(" ");

    }
    public static void compareArrays (String [] n1 , String [] n2){
        for (int i = 0; i < n2.length; i++) {

            for (String numbers : n1){
                if ( n2[i].equals(numbers)){
                    System.out.printf("%s ",numbers);
                }
            }

        }
    }
}
