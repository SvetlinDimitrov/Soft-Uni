package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class MinNumber_02_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        int smallNumber = Integer.MAX_VALUE;
        while(!stop.equals("Stop")){
            int numbers = Integer.parseInt(stop);
            if(smallNumber > numbers){
                smallNumber = numbers;
            }
            stop = scanner.nextLine();
        }
        System.out.printf("%d",smallNumber);
    }
}
