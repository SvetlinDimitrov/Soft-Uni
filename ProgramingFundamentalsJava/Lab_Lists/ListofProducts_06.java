package ProgramingFundamentalsJava.Lab_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListofProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        int num = 1;
        for (String things : products){
            System.out.printf("%d.%s%n",num , things);
            num++;
        }
    }
}
