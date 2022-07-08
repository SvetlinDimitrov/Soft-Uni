package AlgorithmsFundamentalsWithJava.Lab_Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibo = Integer.parseInt(scanner.nextLine());
        long [] arr = new long[fibo+1];

        System.out.println(Fibona(fibo , arr));
    }

    private static long Fibona(int fibo , long [] arr) {
        if ( fibo <= 2){
            return 1 ;
        }
        if(arr[fibo] != 0){
            return arr[fibo];
        }
        return arr[fibo] = Fibona(fibo -1, arr) + Fibona(fibo-2, arr) ;
    }

}
