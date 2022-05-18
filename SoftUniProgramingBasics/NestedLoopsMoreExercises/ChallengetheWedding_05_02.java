package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class ChallengetheWedding_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginN = Integer.parseInt(scanner.nextLine());
        int endN = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean out = false;

        for (int i = 1; i <=beginN ; i++) {
            for (int j = 1; j <=endN ; j++) {
                if(count==tables){
                    out = true;
                    break;
                }
                count++;
                System.out.printf("(%d <-> %d) ",i,j);
            }
            if(out){
                break;
            }

        }
    }
}
