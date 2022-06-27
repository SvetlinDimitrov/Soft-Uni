package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class RecursiveFactorial_04_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Factorial(num));
    }
    public static int Factorial (int num){
        if(num == 1){
            return 1;
        }
        return num * Factorial(num-1);
    }
}
