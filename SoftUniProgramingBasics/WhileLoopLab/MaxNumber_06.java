package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (!stop.equals("Stop")) {
            int numbers = Integer.parseInt(stop);
            if ( maxNumber < numbers){
                maxNumber = numbers;
            }



            stop = scanner.nextLine();
        }
        System.out.printf("%d",maxNumber);
    }
}
