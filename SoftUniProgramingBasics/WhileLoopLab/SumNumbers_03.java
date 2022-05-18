package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finalNumber = Integer.parseInt(scanner.nextLine());
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = numbers;
        while (sum < finalNumber){
            numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;





        }
        System.out.printf("%d",sum);
    }
}
