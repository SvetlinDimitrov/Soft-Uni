package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class SecretDoorLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int SecondN = Integer.parseInt(scanner.nextLine());
        int ThirdN = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=firstN ; i++) {
            for (int j = 1; j <=SecondN ; j++) {
                for (int k = 1; k <=ThirdN ; k++) {
                    if ( i%2==0){
                        if(k%2==0) {
                            if ((j == 2) || (j == 3) || (j == 5) || (j == 7)) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }

                }

            }

        }
    }
}
//•	Горната граница на стотиците - цяло число в диапазона (1-9)
//•	Горната граница на десетиците - цяло число в диапазона (1-9)
//•	Горната граница на единиците - цяло число в диапазона (1-9)

//•	Цифрата на единиците и цифрата на стотиците трябва да бъде четна
//•	Цифрата на десетиците да бъде просто число в диапазона (2...7).