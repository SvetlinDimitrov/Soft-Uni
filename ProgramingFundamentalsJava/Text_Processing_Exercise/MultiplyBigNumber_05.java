package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNumber = scanner.nextLine();
        int divisor = Integer.parseInt(scanner.nextLine());
        StringBuilder sum = new StringBuilder();
        int remainder = 0;

        for (int i = bigNumber.length(); i > 0; i--) {
            int numString = Integer.parseInt(bigNumber.charAt(i - 1) + "");
            int numToAdd = 0;

            if (numString * divisor >= 10) {
                numToAdd = (numString * divisor) % 10;
                if (remainder != 0) {
                    numToAdd += remainder;
                    remainder = 0;
                    if(numToAdd >=10){
                        remainder +=numToAdd/10;
                        sum.append(numToAdd%10);
                    }else {
                        sum.append(numToAdd);
                        remainder += (numString * divisor) / 10;
                    }
                }else{
                    sum.append(numToAdd);
                    remainder+=(numString*divisor)/10;
                }

            }else {
                numToAdd = numString * divisor;
                numToAdd += remainder;
                remainder = 0;
                if (numToAdd > 10) {
                    remainder = numToAdd / 10;
                    sum.append(numToAdd % 10);
                } else {
                    sum.append(numToAdd);
                }
            }
        }
        if(remainder>0){
            sum.append(remainder);
        }
        sum.reverse();
        System.out.println(sum.toString());
    }
}
//23
//2