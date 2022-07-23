package ProgramingFundamentalsJava.Regular_Expressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String index = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b");
        Matcher matcher = pattern.matcher(index);
        List<String> easy = new ArrayList<>();
        while(matcher.find()){
            easy.add(matcher.group());
        }
        System.out.println(String.join(" " , easy));
    }
}
