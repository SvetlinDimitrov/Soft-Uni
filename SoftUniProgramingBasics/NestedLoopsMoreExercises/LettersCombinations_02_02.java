package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class LettersCombinations_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char begin = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char miss = scanner.next().charAt(0);

        int asciiBegin = (int) begin;
        int asciiEnd = (int) end;
        int asciiMiss = (int) miss;
        int count = 0;

        for (int i = asciiBegin; i <= asciiEnd; i++) {
            for (int j = asciiBegin; j <= asciiEnd; j++) {
                for (int k = asciiBegin; k <= asciiEnd; k++) {
                    if (i != asciiMiss) {
                        if (j != asciiMiss) {
                            if (k != asciiMiss) {
                                count++;

                                char first = (char) i;
                                char second = (char) j;
                                char third = (char) k;
                                System.out.printf("%c%c%c ", first, second, third);
                            }
                        }
                    }

                }

            }

        }
        System.out.printf("%d",count);

    }
}
//Ред 1.	Малка буква от английската азбука за начало на интервала – от ‘a’ до ‚z’.
//Ред 2.	Малка буква от английската азбука за край на интервала  – от първата буква до ‚z’.
//Ред 3.	Малка буква от английската азбука – от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.