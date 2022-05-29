package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class FromLefttotheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < times; i++) {
            double sum = 0;
            long [] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            if (numbersArray[0] > numbersArray[1]){
                while( numbersArray[0] > 0){
                    sum += numbersArray[0]%10;
                    numbersArray[0]/=10;
                }
            }else {
                while (numbersArray[1] > 0) {
                    sum += numbersArray[1] % 10;
                    numbersArray[1] /= 10;
                }
            }
            System.out.printf("%.0f%n",sum);
        }
    }
}
