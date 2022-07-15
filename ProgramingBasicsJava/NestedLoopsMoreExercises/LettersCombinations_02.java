package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fistLetter = scanner.nextLine();
        String endLetter = scanner.nextLine();
        String missLetter = scanner.nextLine();
        
        int fist = fistLetter.charAt(0);
        int second = endLetter.charAt(0);;
        int miss = missLetter.charAt(0);
        int count =0;

        for (int i = fist; i <= second ; i++) {
            for (int j = fist; j <=second ; j++) {
                for (int k = fist; k <=second ; k++) {
                        if (!(i == miss || j == miss || k ==miss)){
                            char firstL = (char)i;
                            char secondL = (char)j;
                            char thirdL = (char)k;
                            count++;
                            System.out.printf("%c%c%c ", firstL,secondL,thirdL);
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