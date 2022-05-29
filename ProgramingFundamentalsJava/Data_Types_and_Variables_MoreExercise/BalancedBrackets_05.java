package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Scanner;

public class BalancedBrackets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int leftBracketsSum = 0;
        int rightBracketsSum = 0;

        for (int i = 0; i < times; i++) {
            String words = scanner.nextLine();

            if (words.length() == 1) {
                if (words.equals(")")) {
                    leftBracketsSum++;
                } else if (words.equals("(")) {
                    rightBracketsSum++;
                }
            }


        }
        if (leftBracketsSum == rightBracketsSum) {
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
