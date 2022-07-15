package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= row; i++) {

                count++;
                if(count <= n) {
                    System.out.printf("%d ", count);
                }
            }
            if ( count >= n){
                break;
            }
            System.out.println();
        }
    }
}

