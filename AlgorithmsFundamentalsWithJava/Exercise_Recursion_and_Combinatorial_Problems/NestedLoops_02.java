package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.Scanner;

public class NestedLoops_02 {
    public static boolean [] valid;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[num];
        valid = new boolean[num];
        Nested(numbers , 0 );
    }

    private static void Nested(int[] numbers, int index) {
        if (index >= numbers.length){
            printArr(numbers);
            System.out.println();
            return;
        }
        for (int i = 1; i <= numbers.length ; i++) {
            numbers[index]= i;
            Nested(numbers , index+1);
        }
    }

    private static void printArr(int[] numbers) {
        for (Integer num : numbers){
            System.out.printf("%d ", num);
        }
    }

}
