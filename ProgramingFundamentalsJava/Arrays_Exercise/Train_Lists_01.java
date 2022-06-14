package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Train_Lists_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> num = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(scanner.nextLine()));
            sum+=num.get(i);

        }
        Print(num);
        System.out.println(sum);
    }
    public static void Print(List<Integer> num){
        String print = "";
        for (int i = 0; i < num.size(); i++) {
            print += String.format("%d ",num.get(i));
        }
        System.out.println(print);
    }
}
