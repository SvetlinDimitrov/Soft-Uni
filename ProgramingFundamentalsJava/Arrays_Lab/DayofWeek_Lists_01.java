package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DayofWeek_Lists_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        int n  = Integer.parseInt(scanner.nextLine());

        switch (n){
            case 1:
                System.out.println(days.get(0));
                break;
            case 2:
                System.out.println(days.get(1));
                break;
            case 3:
                System.out.println(days.get(2));
                break;
            case 4:
                System.out.println(days.get(3));
                break;
            case 5:
                System.out.println(days.get(4));
                break;
            case 6:
                System.out.println(days.get(5));
                break;
            case 7:
                System.out.println(days.get(6));
                break;
            default:
                System.out.println("Invalid day!" );
        }
    }
}
