package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chi = Double.parseDouble(scanner.nextLine());
        double com = Double.parseDouble(scanner.nextLine());

        double Bitcoin = bitcoin * 1168;
        chi = (chi * 0.15) *1.76;
        double evro = (Bitcoin + chi) /1.95;
        evro = evro - (evro * com/100);
         System.out.printf("%.2f",evro);


    }
}
//1 биткойн = 1168 лева.
// 1 китайски юан = 0.15 долара.
// 1 долар = 1.76 лева.
// 1 евро = 1.95 лева.

//На първия ред – броят биткойни. Цяло число в интервала [0…20]
// На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
// На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]