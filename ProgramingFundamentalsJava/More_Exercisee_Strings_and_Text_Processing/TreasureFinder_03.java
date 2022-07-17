package ProgramingFundamentalsJava.More_Exercisee_Strings_and_Text_Processing;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        StringBuilder print = new StringBuilder();

        while (!input.equals("find")) {
            print.delete(0, print.length());
            print.append(input);
            int count = 0;

            while (count < print.length()) {
                for (int i = 0; i < numbers.length; i++) {
                    count++;
                    if (count >= print.length()) {
                        break;
                    }
                    for (int j = 0; j < print.length(); j++) {
                        char currentChar = (char) (print.charAt(j) - numbers[i]);
                        print.deleteCharAt(j);
                        print.insert(j, currentChar);
                    }
                }
            }
            System.out.println(print.toString());

            input = scanner.nextLine();
        }
    }
}
