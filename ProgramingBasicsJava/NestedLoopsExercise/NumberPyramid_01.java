package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.printf("%d ",count);
                if ( count == n){
                    flag = true;
                    break;
                }
            }
            if ( flag){
                break;
            }
            System.out.println();

        }
    }
}
