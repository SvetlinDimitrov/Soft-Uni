package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Scanner;

public class PermutationsWithoutRepetitions_swap_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        PermutationSwap(array, 0);
    }

    private static void PermutationSwap(String[] array, int index) {
        if (index == array.length) {
            System.out.println(String.join(" ", array));
            return;
        }
        PermutationSwap(array, index + 1);
        for (int i = index+1; i < array.length; i++) {
            Swap(array , index , i);
            PermutationSwap(array, index + 1);
            Swap(array , index , i);


        }
    }

    private static void Swap(String[] array, int start, int end) {
        String save = array[start];
        array[start] = array[end];
        array[end] = save;
    }

}

