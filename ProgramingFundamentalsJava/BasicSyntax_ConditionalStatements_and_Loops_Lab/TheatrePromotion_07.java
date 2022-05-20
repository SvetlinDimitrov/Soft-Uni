package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Lab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticket = 0;
        boolean flag = false;

        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticket = 12;
                } else if (age <= 64) {
                    ticket = 18;
                } else if (age <= 122) {
                    ticket = 12;
                } else {
                    flag = true;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticket = 15;
                } else if (age <= 64) {
                    ticket = 20;
                } else if (age <= 122) {
                    ticket = 15;
                } else {
                    flag = true;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticket = 5;
                } else if (age <= 64) {
                    ticket = 12;
                } else if (age <= 122) {
                    ticket = 10;
                } else {
                    flag = true;
                }
                break;
            default:
                flag=true;
        }
        if (flag) {
            System.out.println("Error!");
        }else{
            System.out.printf("%d$",ticket);
        }
    }
}
