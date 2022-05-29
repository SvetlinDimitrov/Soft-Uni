package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstNumber = Float.parseFloat(scanner.nextLine());
        float secondNumber = Float.parseFloat(scanner.nextLine());
        final float eps = 0.000001f;
         if (Math.abs(firstNumber - secondNumber) < eps){
             System.out.println("True");
         }else {
             System.out.println("False");
         }
    }
}
