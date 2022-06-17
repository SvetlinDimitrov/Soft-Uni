package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listGuests = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (!listGuests.contains(input.split(" ")[0]) && input.contains("is going")) {
                listGuests.add(input.split(" ")[0]);
            } else if (listGuests.contains(input.split(" ")[0]) && input.contains("is going")) {
                System.out.printf("%s is already in the list!%n", input.split(" ")[0]);
            } else if (!listGuests.contains(input.split(" ")[0]) && input.contains("is not going")) {
                System.out.printf("%s is not in the list!%n", input.split(" ")[0]);
            } else {
                listGuests.remove(input.split(" ")[0]);
            }
        }
        for (String names :listGuests){
            System.out.println(names);
        }
    }
}
