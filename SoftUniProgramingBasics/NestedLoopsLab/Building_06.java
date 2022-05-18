package SoftUniProgramingBasics.NestedLoopsLab;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < p; j++) {
                if (i == n) {
                    System.out.printf("L%d%d ", i, j);
                    if (j == p - 1) {
                        System.out.printf("%n");
                    }
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                    if (j == p - 1) {
                        System.out.printf("%n");
                    }
                } else {
                    System.out.printf("A%d%d ", i, j);
                    if (j == p - 1) {
                        System.out.printf("%n");
                    }
//                if (i % 2 == 0 && i<n) {
//                    System.out.printf("A%d%d ", i, j);
//                    if (j == p) {
//                        System.out.printf("%n");
//                    }
//                }else if (i == n) {
//                    System.out.printf("L%d%d ", i, j);
//                }else{
//                        System.out.printf("O%d%d ", i, j);
//                        if (j == p) {
//                            System.out.printf("%n");
//                        }
//
//                    }


                }
            }
        }
    }
}