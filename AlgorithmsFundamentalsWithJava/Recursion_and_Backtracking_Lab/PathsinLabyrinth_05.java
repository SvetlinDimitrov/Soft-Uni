package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Scanner;

public class PathsinLabyrinth_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int cloe = Integer.parseInt(scanner.nextLine());

        char [][] labyrinth = new char [row][cloe];
        for (int i = 0; i < row; i++) {
            labyrinth[i] = scanner.nextLine().toCharArray();
        }
        PathInLabyrinth(labyrinth , 0 , 0 ,' ');
    }
    public static void PathInLabyrinth(char [][] lab , int row , int cloe , char direction){
        if ( !isInBounds(lab ,row , cloe) || lab[row][cloe] =='V'|| lab[row][cloe]=='*'){
            return;
        }
        if (lab[row][cloe] == 'e') {
        System.out.printf("%d %d%n",row,cloe);
        return;
        }
        lab[row][cloe]='V';

        PathInLabyrinth(lab,row-1,cloe , 'U');
        PathInLabyrinth(lab,row+1,cloe , 'D');
        PathInLabyrinth(lab,row,cloe-1, 'L');
        PathInLabyrinth(lab,row,cloe+1, 'R');

        lab[row][cloe] ='-';

    }
    public static boolean isInBounds (char[][] lab,int row , int cloe){
        return row < lab.length && row >= 0  && cloe < lab[row].length && cloe >=0;
    }


}
