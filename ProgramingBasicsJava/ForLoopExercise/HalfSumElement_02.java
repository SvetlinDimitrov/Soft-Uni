package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int collection = 0;
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            collection += numbers;
            if (max < numbers) {
                max = numbers;
            }
        }
        collection = collection - max;
        if (collection == max) {
            System.out.printf("Yes%nSum = %d", collection);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(collection - max));
        }
    }
}
