package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class Thesongofthewheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String fourth = "";
        String no = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i < j) && (k > l) && (((i * j) + (k * l)) == N)) {
                            count++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (count == 4) {
                                fourth = "" + i + j + k + l;
                            }
                        }

                    }

                }

            }

        }
        if (!fourth.equals("")) {
            System.out.printf("Password: %s", fourth);
        }else {
            System.out.println("No!");
        }
    }
}
//От конзолата се чете едно цяло число (контролната стойност): M – цяло число в интервала [4 … 144];