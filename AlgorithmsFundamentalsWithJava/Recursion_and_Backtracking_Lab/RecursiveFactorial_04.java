package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class RecursiveFactorial_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        System.out.println(Factroial(n));

    }
    public static long Factroial (long num){
        if (num == 1){
            return num;
        }
        return num * Factroial(num-1);
    }
}
