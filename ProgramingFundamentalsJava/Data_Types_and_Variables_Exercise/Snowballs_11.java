package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowBalls = Integer.parseInt(scanner.nextLine());
        double maxSum = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 0; i < numberSnowBalls; i++) {
            double sum = 0;
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            sum = Math.pow((snowballSnow*1.0/snowballTime) , snowballQuality);
            if ( maxSum < sum){
                maxSum = sum;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality ;
                maxSnowballSnow = snowballSnow;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxSum,maxSnowballQuality);
    }
}
//"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"

//•	On the first line, you will get the snowballSnow – an integer.
//•	On the second line, you will get the snowballTime – an integer.
//•	On the third line, you will get the snowballQuality – an integer.