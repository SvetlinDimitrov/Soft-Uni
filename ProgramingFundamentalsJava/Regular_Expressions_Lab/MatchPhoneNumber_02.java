package ProgramingFundamentalsJava.Regular_Expressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\+359([ -])2(?:\\1)\\b\\d{3}\\b(?:\\1)\\b\\d{4}\\b");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<String> list = new ArrayList<>();

        while (matcher.find()){
            list.add(matcher.group());
        }
        System.out.println(String.join(", " , list));
    }
}
