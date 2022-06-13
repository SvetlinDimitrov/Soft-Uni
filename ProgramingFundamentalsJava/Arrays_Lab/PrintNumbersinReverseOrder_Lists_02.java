package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumbersinReverseOrder_Lists_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String print = "";
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = n-1; i >= 0; i--) {
            print += String.format("%d ",numbers.get(i));
        }
        System.out.println(print);
    }
}
