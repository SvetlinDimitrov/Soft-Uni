package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yard = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int countDays = 0;
        int currentYard = 0;
        for (int i = yard; i >=100 ; i-=10) {

            sum+=i -26;
            countDays++;
            currentYard =i;
        }
        if ( currentYard-10  < 100){
            if(sum >= 26) {
                sum -= 26;
            }
        }
        System.out.println(countDays);
        System.out.println(sum);
    }
}
