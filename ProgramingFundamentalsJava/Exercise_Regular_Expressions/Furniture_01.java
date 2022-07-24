package ProgramingFundamentalsJava.Exercise_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furniture = new ArrayList<>();
        Pattern pattern = Pattern.compile(">>(?<furniture>\\w+)<<(?<price>\\d+.?\\d*)!(?<quontity>\\d+)");
        double sum = 0;
        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                furniture.add(matcher.group("furniture"));
                sum+=Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quontity"));
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String word : furniture){
            System.out.println(word);
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
