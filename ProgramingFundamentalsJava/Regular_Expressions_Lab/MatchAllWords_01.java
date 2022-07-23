package ProgramingFundamentalsJava.Regular_Expressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAllWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "_ (Underscores) are also word characters!";
        Pattern pattern = Pattern.compile("\\w+");
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
