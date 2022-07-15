package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double nowMoney = Double.parseDouble(scanner.nextLine());


        int daySpend = 0;
        boolean out = false;

        int allDays = 0;

        while (true){
            String saveSpend = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

                if (saveSpend.equals("spend")) {
                    daySpend++;
                    nowMoney -= money;
                    allDays++;
                    if (daySpend == 5) {
                        out = true;
                        break;
                    }
                }else{
                    if (nowMoney<0){
                        nowMoney= 0;
                    }
                    allDays++;
                    daySpend=0;
                    nowMoney+=money;
                    if ( needMoney <= nowMoney){
                        out = false ;
                        break;
                    }
            }

        }
        if (!out){
            System.out.printf("You saved the money for %d days.",allDays);
        }else{
            System.out.println("You can't save the money.");
            System.out.printf("%d",daySpend);
        }
    }
}
