package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class SumofTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int magicN = Integer.parseInt(scanner.nextLine());
        int count = 0 ;
        boolean flag = false ;
        int i=1;
        int j =1;
        for (i = firstN; i <= secondN ; i++) {
            for (j = firstN; j <=secondN ; j++) {
                int sum = i+j;
                count++;
                if ( sum == magicN){
                    flag = true;
                    break;
                }

            }
            if(flag){
                break;
            }

        }
        if(flag){
            System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magicN);
        }else {
            System.out.printf("%d combinations - neither equals %d",count,magicN);
        }
    }
}
//•	Първи ред – начало на интервала – цяло число в интервала [1...999]
//•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
//•	Трети ред – магическото число – цяло число в интервала [1...10000]