package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class NumbersEndingin7_while_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 7;
        while(i<=1000){
            if (i%10==7){
                System.out.printf("%d%n",i);
            }
            i++;
        }
    }
}
