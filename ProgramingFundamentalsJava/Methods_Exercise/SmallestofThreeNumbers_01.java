package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class SmallestofThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = 3 ;
        int [] numbers = ReadingTheConsoleArray(times , scanner);
        FindingTheSmallestNumber(numbers);
    }
    public static int [] ReadingTheConsoleArray(int times , Scanner scanner){
        int [] numbers = new int [times];
        for (int i = 0; i < times; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        return numbers;
    }
    public static void FindingTheSmallestNumber (int [] num){
        int minValue = Integer.MAX_VALUE;
        for (int j : num) {
            if (minValue > j) {
                minValue = j;
            }
        }
        System.out.println(minValue);
    }
}
