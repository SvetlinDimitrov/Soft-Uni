package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        int p3 = Integer.parseInt(scanner.nextLine());
        int box = p1 * p2 * p3;
        String done = scanner.nextLine();
        boolean flag = false;

        while (!done.equals("Done")) {
            int things = Integer.parseInt(done);
            if (things < box) {
                box -= things;
            } else {
                flag = true;
                box -= things;
                break;
            }
            done = scanner.nextLine();
        }
        if (flag) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(box));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(box));
        }
    }
}