package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Firm05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
           int hour = Integer.parseInt(scanner.nextLine());
           int days = Integer.parseInt(scanner.nextLine());
           int slujiteli = Integer.parseInt(scanner.nextLine());
           double rabotniDays = days -(days *0.1) ;
           double rabotniChasove = rabotniDays * 8 ;
           double izvunChasove = slujiteli* (2 * days) ;
           double obshtoRabota = Math.floor(rabotniChasove + izvunChasove) ;
           if ( hour < obshtoRabota) {
               System.out.printf("Yes!%.0f hours left.", obshtoRabota - hour);
           }else {
               System.out.printf("Not enough time!%.0f hours needed." , hour - obshtoRabota);
           }
    }
}
//        •	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
//        •	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
//        •	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]
