package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()); //power
        int M = Integer.parseInt(scanner.nextLine()); //distance
        int Y = Integer.parseInt(scanner.nextLine()); //exhaustionFactor
        int count = 0;
        double halfPower = N *0.5;


        while (N > M){
            N-=M;
            count++;
            if (halfPower == N) {
                if (halfPower > 0) {
                    N /= Y;
                }
            }

        }
        System.out.println(N);
        System.out.println(count);


    }
}
//•	The input consists of 3 lines.
//•	On the first line, you will receive N – an integer.
//•	On the second line, you will receive M – an integer.
//•	On the third line, you will receive Y – an integer.