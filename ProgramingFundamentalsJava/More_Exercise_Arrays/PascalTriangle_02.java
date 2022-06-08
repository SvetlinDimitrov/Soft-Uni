package ProgramingFundamentalsJava.More_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int[] num = new int[times];

        int [] copyMasive =new int [times];
        Arrays.fill(num, 1);



        for (int i = 1; i <= times; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    copyMasive[j-1] = 1;
                    System.out.printf("%d ", copyMasive[j - 1]);
                } else {
                    copyMasive[j - 1] = num[j - 2] + num[j - 1];
                    System.out.printf("%d ", copyMasive[j - 1]);

                }
            }
            num = copyMasive;
            System.out.println();
        }
    }
}
