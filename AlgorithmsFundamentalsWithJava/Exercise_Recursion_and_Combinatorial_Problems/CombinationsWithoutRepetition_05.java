package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.Scanner;

public class CombinationsWithoutRepetition_05 {
    public static int range;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        range = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int [] num = new int[n];
        Comb(num, 1, 0);
    }

    private static void Comb(int[] num, int start, int index) {
        if(index>= num.length){
            printt(num);
            System.out.println();
            return;
        }
        for (int i = start; i <= range ; i++) {
            num[index] = i;
            Comb(num , i +1, index+1);
        }
    }

    private static void printt(int[] num) {
        for (Integer numbers : num){
            System.out.printf("%d ", numbers );
        }
    }
}
