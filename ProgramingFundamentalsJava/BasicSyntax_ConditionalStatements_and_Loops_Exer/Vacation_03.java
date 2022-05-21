package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String people = scanner.nextLine();
        String day = scanner.nextLine();
        double pay = 0 ;

        switch (day) {
            case "Friday":
                switch(people){
                    case "Students":
                        pay =8.45;
                        break;
                    case "Business":
                        pay =10.90;
                        break;
                    case "Regular":
                        pay =15;
                        break;
                }
                break;
            case "Saturday":
                switch(people){
                    case "Students":
                        pay =9.80;
                        break;
                    case "Business":
                        pay =15.60;
                        break;
                    case "Regular":
                        pay =20;
                        break;
                }
                break;
            case "Sunday":
                switch(people){
                    case "Students":
                        pay =10.46;
                        break;
                    case "Business":
                        pay =16;
                        break;
                    case "Regular":
                        pay =22.50;
                        break;
                }
                break;
        }
       double allToPay = pay *number;
        if (people.equals("Students") && number>=30){
            allToPay= allToPay - (allToPay*0.15);
        }
        if (people.equals("Business") && number>=100){
            allToPay = allToPay - (pay * 10);
        }
        if (people.equals("Regular") &&( number>=10 && number <=20)){
            allToPay= allToPay - (allToPay*0.05);
        }
        System.out.printf("Total price: %.2f",allToPay);
    }
}
//•	Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
//•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
//•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%

//       	Friday	Saturday	Sunday
//Students	8.45	9.80	10.46
//Business	10.90	15.60	16
//Regular	15	      20	22.50