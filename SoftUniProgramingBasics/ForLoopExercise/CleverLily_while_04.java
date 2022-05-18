package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class CleverLily_while_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int birdDayMoney = 0;
        int toys = 0;
        int badBrother = 0;

        while (i <= years){
            if (i %2 ==0){
            birdDayMoney += 10*i/2;
            badBrother+=1;
            }else {
                toys+=1;
            }
            i++;
        }
        double allMoney = (birdDayMoney - badBrother) + (toyPrice * toys);
        if ( washingMachine < allMoney){
            System.out.printf("Yes! %.2f",allMoney-washingMachine);
        }else {
            System.out.printf("No! %.2f",washingMachine - allMoney);
        }
    }
}
