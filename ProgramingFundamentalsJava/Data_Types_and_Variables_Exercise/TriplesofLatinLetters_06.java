package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class TriplesofLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 +end ; i++) {
            for (int j = 97; j <97 + end ; j++) {
                for (int k = 97; k <97 + end ; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);

                }

            }
            
        }
    }
}
