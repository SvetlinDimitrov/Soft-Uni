package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.Scanner;

public class CombinationsWithRepetition_03 {
    public static int b ;
    public static boolean [] valid;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());

        valid = new boolean[b];
        int [] numbers = new int [b];

        Combination(numbers , range  , 0 ,1);
    }

    private static void Combination(int[] numbers, int range , int index , int start) {
        if (index >= b){
            print(numbers);
            System.out.println();
            return;

        }

        for (int i = start; i <= range; i++) {
            numbers[index] = i;
            Combination(numbers,range,index+1 ,i);
        }
    }

    private static void print(int[] numbers) {
        for (Integer num : numbers){
            System.out.printf("%d ",num);
        }
    }
}
