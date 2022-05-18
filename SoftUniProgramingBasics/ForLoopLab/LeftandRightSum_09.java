package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class LeftandRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= n ; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sum = sum + numbers;
            } else {
                sum2 = sum2 + numbers;

            }
        }
        if (sum == sum2) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - sum2));
        }
    }
}
