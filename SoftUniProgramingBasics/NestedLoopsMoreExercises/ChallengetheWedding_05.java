package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class ChallengetheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int End = Integer.parseInt(scanner.nextLine());
        int count =0;

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=w ; j++) {
                count++;
                if ( count <= End){
                    System.out.printf("(%d <-> %d) ",i,j );
                }
            }

        }
    }
}
//•	Броя клиенти мъже - цяло число в интервала [1...100]
//•	Броя клиенти жени - цяло число в интервала [1...100]
//•	Максималният брой маси - цяло число в интервала [1...100]