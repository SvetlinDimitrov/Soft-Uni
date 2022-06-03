package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        int times = Integer.parseInt(scanner.nextLine());

        System.out.println(String.join(" ",ReverseArray(times , numbers)));
    }
    public static String [] ReverseArray (int timesLoop , String [] n1){
        for (int i = 0; i < timesLoop; i++) {
            String saveString = n1[0];
            for (int j = 0; j < n1.length-1; j++) {

                n1[j] = n1[j+1];

            }
            n1[n1.length-1] = saveString;

        }
        return n1 ;
    }
 }
