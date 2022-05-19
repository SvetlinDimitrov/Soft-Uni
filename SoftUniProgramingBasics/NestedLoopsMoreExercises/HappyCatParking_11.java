package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double money =0;
        double sumMoney = 0;
        for (int i = 1; i <=days ; i++) {
            money =0;
            for (int j = 1; j <=hours ; j++) {
                if (i%2==0 && j%2!=0){
                    money+=2.5;
                }else if (i%2!=0 && j%2==0){
                    money+=1.25;
                }else{
                    money+=1;
                }
                if (j==hours){
                    sumMoney+=money;
                    System.out.printf("Day: %d - %.2f leva%n",i,money);
                }

            }

        }
        System.out.printf("Total: %.2f leva",sumMoney);
    }
}
//•	Брой дни – цяло число в интервала [1 … 5]
//•	Брой часове за всеки един от дните - цяло число в интервала [1 … 24]