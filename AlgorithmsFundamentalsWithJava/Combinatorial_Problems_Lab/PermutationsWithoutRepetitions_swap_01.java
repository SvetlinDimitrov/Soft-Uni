package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Scanner;

public class PermutationsWithoutRepetitions_swap_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        PermutationSwap(array, 0);
    }

    private static void PermutationSwap(String[] array, int end) {
        if (end == array.length) {
            System.out.println(String.join(" ", array));
            return;
        }
        PermutationSwap(array, end + 1);
        for (int i = 0; i < array.length; i++) {

            for (int j = end; j < 1; j++) {
                String save = array[j];
                array[j] = array[end];
                array[end] = save;
            }
            PermutationSwap(array, end + 1);
            for (int j = end; j < 1; j++) {
                String save = array[j];
                array[j] = array[end];
                array[end] = save;
            }


        }
    }
}

