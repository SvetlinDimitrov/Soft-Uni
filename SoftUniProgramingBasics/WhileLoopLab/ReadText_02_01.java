package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class ReadText_02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        while (!stop.equals("Stop")){
            System.out.printf("%s%n",stop);
            stop = scanner.nextLine();
        }
    }
}
