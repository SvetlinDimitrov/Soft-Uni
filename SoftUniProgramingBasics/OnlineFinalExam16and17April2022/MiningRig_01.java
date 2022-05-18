package SoftUniProgramingBasics.OnlineFinalExam16and17April2022;

import java.util.Scanner;

public class MiningRig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int card = Integer.parseInt(scanner.nextLine());
        int pr = Integer.parseInt(scanner.nextLine());
        double electricCurrent = Double.parseDouble(scanner.nextLine());
        double win = Double.parseDouble(scanner.nextLine());

        double cardWin = card * 13;
        double prWin = pr * 13 ;
        double allMoney = cardWin + prWin + 1000;
        double wincardDay = win -electricCurrent;
        double asdas = wincardDay * 13;
       double fuck  = allMoney/asdas;

        System.out.printf("%.0f%n%.0f",allMoney,Math.ceil(fuck));

    }
}
//	На първия ред: цена на една видео карта – цяло число в интервала [1 … 2000]
//•	На втория ред: цена на един преходник – цяло число в интервала [1 … 50]
//•	На третия ред: цена на консумирания ток от карта за ден – реално число в интервала [0.01 ... 10.00]
//•	На четвъртия ред: печалба от една карта за един ден – реално число в интервала [1.00 ... 100.00]