package HckerRank_Practice;


import java.util.Arrays;
import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        double sum = 0;


        for (int i = 0; i < times; i++) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double number3 = scanner.nextDouble();
            sum = number1;

            for (double j = 0; j <number3 ; j++) {
                sum = sum + Math.pow(2,j ) * number2;
                System.out.printf("%.0f ",sum);
            }
            System.out.println();



        }
    }
}
