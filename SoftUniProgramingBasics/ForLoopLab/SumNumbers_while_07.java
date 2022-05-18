package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class SumNumbers_while_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int sum = 0;
        while (i <= n){
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
            i++;
        }
        System.out.printf("%d",sum);
    }
}
