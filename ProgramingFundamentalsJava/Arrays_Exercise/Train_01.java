package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int [times];
        int sum = 0;
        for (int i = 0; i < times; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum+=numbers[i];

        }
        for (int number : numbers){
            System.out.printf("%d ",number);
        }
        System.out.println();
        System.out.println(sum);
    }
}
