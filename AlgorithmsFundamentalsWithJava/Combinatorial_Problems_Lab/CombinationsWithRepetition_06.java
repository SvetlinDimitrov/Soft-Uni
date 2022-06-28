package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Scanner;

public class CombinationsWithRepetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        int big = Integer.parseInt(scanner.nextLine());
        String[] copy = new String[big];
        Combination(arr, copy, 0, 0);
    }

    private static void Combination(String[] arr, String[] copy, int index, int start) {
        if (index >= copy.length) {
            System.out.println(String.join(" ", copy));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            copy[index] = arr[i];
            Combination(arr, copy, index + 1, i);
        }
    }
}


