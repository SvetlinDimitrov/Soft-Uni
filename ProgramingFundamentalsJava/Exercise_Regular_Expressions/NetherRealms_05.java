package ProgramingFundamentalsJava.Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern health = Pattern.compile("[A-Za-z]");
        String[] input = scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            if (!input[i].contains(" ") || !input[i].contains(",") ) {

                Matcher matcher = health.matcher(input[i]);
                int sumHealth = 0;
                while (matcher.find()) {
                    char currentLetter = matcher.group().charAt(0);
                    sumHealth += currentLetter;
                }
                if(sumHealth==0){
                    break;
                }
                Pattern attack = Pattern.compile("-?\\d+\\.?\\d*");
                Matcher matcher1 = attack.matcher(input[i]);
                double sumAttack = 0;
                while (matcher1.find()) {
                    String currentWord = matcher1.group();
                    char letter = currentWord.charAt(0);
                    if (currentWord.charAt(0) != '-') {
                        sumAttack += Double.parseDouble(currentWord);
                    } else {
                        sumAttack += Double.parseDouble(currentWord);
                    }
                }
                int countMulty = 0;
                int divine = 0;
                for (int j = 0; j <= input[i].length()-1; j++) {
                    if (input[i].charAt(j) == '*') {
                        countMulty++;
                    } else if (input[i].charAt(j) == '/') {
                        divine++;
                    }
                }
                for (int j = 0; j < countMulty; j++) {
                    sumAttack *= 2;
                }
                for (int j = 0; j < divine; j++) {
                    sumAttack /= 2;
                }
                System.out.printf("%s - %d ", input[i], sumHealth);
                System.out.printf("health, %.2f damage%n", sumAttack);
            }
        }
    }
}
