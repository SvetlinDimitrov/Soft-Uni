package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class Oscarsceremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        double p1 =  sum - (sum * 0.3);
        double p2 =  p1 - (p1 * 0.15);
        double p3 = p2*0.5 ;
        double allMoney = sum + p1 +p2+p3 ;
        System.out.printf("%.2f",allMoney);
    }
}
