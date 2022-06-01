package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Scanner;

public class DayofWeek_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (n - 1 <= 6) {
            System.out.printf("%s ", dayOfWeek[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
