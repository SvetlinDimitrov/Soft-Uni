package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        String [] copyArrays = new String [times];
        String [] copyArrays2 = new String [times];

        for (int i = 0; i <times ; i++) {
          String [] numbers = scanner.nextLine().split(" ");

            for (int j = 0; j < numbers.length-1; j++) {
                if (i   % 2 == 0) {
                    copyArrays[i] = numbers[j+1];
                    copyArrays2[i] = numbers[j];
                }else {
                    copyArrays2[i] = numbers[j+1];
                    copyArrays[i] = numbers[j];
                }
            }

        }
        System.out.println(String.join(" ",copyArrays2));
        System.out.println(String.join(" ",copyArrays));

        }
        
    }


