package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        minute+=30;

        if(minute>=60){
            minute-=60;
            hour++;
        }
        if (hour>=24){
            hour-=24;
        }
        System.out.printf("%d:%02d",hour,minute);
    }
}
