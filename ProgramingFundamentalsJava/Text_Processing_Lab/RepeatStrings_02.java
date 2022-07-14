package ProgramingFundamentalsJava.Text_Processing_Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String[] stringArr = scanner.nextLine().split("\\s+");
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[i].length(); j++) {
                System.out.print(stringArr[i]);
            }
        }
    }
}
