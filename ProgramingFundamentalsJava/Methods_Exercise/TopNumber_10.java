package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 1; i <= times; i++) {
            if (TopNumber(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean TopNumber (int times){
        boolean secondCondition = false;
        boolean firstCondition = false;
        int sum =0;
        while(times > 0){
            int number = times %10;
            sum += number;
            if(number%2 !=0){
                secondCondition=true;
            }

            times/=10;
        }
        if (sum % 8 ==0){
            firstCondition = true;
        }
        return secondCondition && firstCondition;
    }
}
