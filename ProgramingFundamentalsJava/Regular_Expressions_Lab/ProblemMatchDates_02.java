package ProgramingFundamentalsJava.Regular_Expressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemMatchDates_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "30-Dec-1994 , 09-Jul-1955 , 01-July-2000";
        Pattern pattern = Pattern.compile("(\\d{2})-([A-Za-z]{3})-(\\d{4})");
        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        while(matcher.find()) {
            list.add(matcher.group());
        }
        for(String word : list){
            System.out.println(word);
        }
    }
}
