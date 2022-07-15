package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class SumNumbers_02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Final = Integer.parseInt(scanner.nextLine());
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = numbers;
        while (sum < Final){
            numbers = Integer.parseInt(scanner.nextLine());
            sum+=numbers;

        }
        System.out.printf("%d",sum);
    }
}
