package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Scanner;

public class DayofWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysArray[n - 1]);


    }
}
//{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}.