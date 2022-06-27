package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class PathsinLabyrinth_05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cloe = Integer.parseInt(scanner.nextLine());
        int row = Integer.parseInt(scanner.nextLine());

        char [][] labyrinth = new char [cloe][row];
        for (int i = 0; i < cloe; i++) {
            labyrinth[i] = scanner.nextLine().toCharArray();
        }

        System.out.println();
    }
    public static void LabyrinthExith(char[][] lab , int cloe , int row){

    }
}
