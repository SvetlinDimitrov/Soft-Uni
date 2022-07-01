package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.Scanner;

public class ConnectedAreasinaMatrix_06 {
    public static char [][] matrix ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        matrix = new char[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            matrix[i] = scanner.nextLine().toCharArray();

            for (int row = 0; row < matrix.length; row++) {
                for (int clow = 0; clow < matrix[row].length; clow++) {
                    System.out.printf("%c ",matrix[row][clow]);
                    count++;

                }
                System.out.println();
            }

        }
    }
}
