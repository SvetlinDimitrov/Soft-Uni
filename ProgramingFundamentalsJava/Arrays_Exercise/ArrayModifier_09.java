package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String [] input = scanner.nextLine().split(" ");
        while(!input[0].equals("end")){

            if (input[0].equals("swap")){
                int n1 = Integer.parseInt(input[1]);
                int n2 = Integer.parseInt(input[2]);
                int saveNumber = numbers[n1];
                numbers[n1] = numbers[n2];
                numbers[n2] = saveNumber;
            }else if (input[0].equals("multiply")){
                int n1 = Integer.parseInt(input[1]);
                int n2 = Integer.parseInt(input[2]);
                numbers[n1] = numbers[n1] * numbers[n2];
            }else {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }

                }


            input = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.printf("%d, ",numbers[i]);

        }
        System.out.printf("%d",numbers[numbers.length-1]);
    }
}
