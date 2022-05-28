package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Scanner;

public class FromLefttotheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {

            long firstNumber = scanner.nextLong();
            long secondNumber = scanner.nextLong();
            int sum = 0;

            if ( firstNumber > secondNumber){
                for (long j = firstNumber; j > 0 ; j/=10) {
                    sum += j%10;
                }
                System.out.println(sum);
            }else {
                for (long j = secondNumber; j > 0 ; j/=10) {
                    sum += j%10;
                }
                System.out.println(sum);
            }

        }
    }
}
