package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Password_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String tryPass = scanner.nextLine();
        while (!tryPass.equals(password)){
            tryPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name);
    }
}
