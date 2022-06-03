package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = Integer.parseInt(scanner.nextLine());
        Train (loops , scanner);

    }
    public static void Train (int times , Scanner scanner){
            int [] numbers = new int [times];
            int count = 0;
        for (int j = 0; j <times ; j++) {
            numbers [j]  = Integer.parseInt(scanner.nextLine());
            System.out.printf("%d ",numbers[j]);
            count+=numbers[j];

        }
        System.out.println();
        System.out.println(count);
    }
}
