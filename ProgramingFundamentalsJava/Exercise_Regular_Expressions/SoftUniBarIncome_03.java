package ProgramingFundamentalsJava.Exercise_Regular_Expressions;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%\\w*<(?<product>\\w+)>\\w*\\|(?<count>\\d+)\\|[A-Za-z_]*(?<price>\\d+.?\\d*)\\$");
        double allSum = 0;

        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count*price;
                allSum+=sum;
                System.out.printf("%s: %s - %.2f%n",name,product,sum);

            }

            input= scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",allSum);
    }
}
