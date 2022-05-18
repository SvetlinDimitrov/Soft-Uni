package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double P1H = P1 * H ;
        double P2H = P2 * H ;
        double celqataVoda = P1H + P2H ;
        double procentP1H = P1H/celqataVoda * 100 ;
        double procentP2H = P2H/celqataVoda * 100 ;
        if (celqataVoda > V) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H , Math.abs(V - celqataVoda));

        }else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (celqataVoda/V)*100 , procentP1H , procentP2H );
        }

    }
}
//        •	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
//        •	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
//        •	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
//        •	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
