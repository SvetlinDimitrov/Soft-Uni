package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while(!stop.equals("Stop")){
            int numbers = Integer.parseInt(stop);
            if (minNumber > numbers){
                minNumber = numbers;
            }

            stop = scanner.nextLine();
        }
        System.out.printf("%d",minNumber);
    }
}
