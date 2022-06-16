package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class RecursiveDrawing_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        print(n);
    }
    public static void print (int index){
        if ( index == 0){
            return;
        }
        for (int i = 0; i < index; i++) {
            System.out.printf("%c",'*');
        }
        System.out.println();

        print(index-1);

        for (int i = 0; i < index; i++) {
            System.out.printf("%c",'#');
        }
        System.out.println();

    }
}
