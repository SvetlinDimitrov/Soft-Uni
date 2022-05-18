package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String realPass = scanner.nextLine();
        String pass = scanner.nextLine();
        while(!pass.equals(realPass)){
            pass= scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
