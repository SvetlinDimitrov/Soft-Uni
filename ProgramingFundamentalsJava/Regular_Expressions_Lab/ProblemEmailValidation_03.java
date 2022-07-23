package ProgramingFundamentalsJava.Regular_Expressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemEmailValidation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b(\\w+)@([A-Za-z]+).([A-Za-z]+)\\b");
        String input = "valid123@email.bg , invalid*name@emai1.bg , easy12@bitch.com";
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
