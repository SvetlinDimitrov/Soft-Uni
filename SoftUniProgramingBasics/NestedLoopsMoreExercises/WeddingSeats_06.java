package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sector = scanner.nextLine();
        int red = Integer.parseInt(scanner.nextLine());
        int mqsto = Integer.parseInt(scanner.nextLine());
        int mqstochetni = mqsto+2;

        int start = sector.charAt(0);

        for (int i = 65; i <=start ; i++) {
            for (int j = 1; j <=red ; j++) {
                for (int k = 97; k <=97+mqstochetni ; k++) {
                    if (!(j%2==0)){


                    }
                    
                }
                red++;
            }

        }


    }
}
//•	Последния сектор от секторите - символ (B-Z)
//•	Броят на редовете в първия сектор - цяло число (1-100)
//•	Броят на местата на нечетен ред - цяло число (1-24)