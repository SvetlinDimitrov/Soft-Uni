package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            char symbol = name.charAt(i);
            pass += symbol;

        }
        int count = 0;
        boolean out = false;
        String login = scanner.nextLine();
        while (!login.equals(pass)) {
            count++;
            if (count == 4) {
                out = true;
                break;

            }
            System.out.println("Incorrect password. Try again.");
            login = scanner.nextLine();
        }
        if (out) {
            System.out.println("User sunny blocked!");
        } else {
            System.out.printf("User %s logged in.", name);
        }
    }
}
