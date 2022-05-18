package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class Workout_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double kmFirst = Double.parseDouble(scanner.nextLine());
        double Allkm = kmFirst;

        for (int i = 1; i <= n; i++) {
            int kmBonus = Integer.parseInt(scanner.nextLine());
            kmFirst = kmFirst + (kmFirst * kmBonus / 100);
            Allkm+=kmFirst;


        }
        if (Allkm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(Allkm-1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - Allkm));
        }
    }
}