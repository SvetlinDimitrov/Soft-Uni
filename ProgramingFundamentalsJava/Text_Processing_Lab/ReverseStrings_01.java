package ProgramingFundamentalsJava.Text_Processing_Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("end")){
            char [] arr = input.toCharArray();
            String newString = "";
            for (int i = arr.length-1; i >= 0; i--) {
                newString += arr[i];
            }
            System.out.printf("%s = %s%n",input , newString);
            input = scanner.nextLine();

        }

    }
}
