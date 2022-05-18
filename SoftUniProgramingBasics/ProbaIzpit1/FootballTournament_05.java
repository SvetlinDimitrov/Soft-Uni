package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class FootballTournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            String game = scanner.nextLine();
            switch (game) {
                case "W":
                    p1++;
                    points = points + 3;
                    break;
                case "D":
                    p2++;
                    points = points + 1;
                    break;
                case "L":
                    p3++;
                    break;

            }

        }
        if ( n ==0 ){
            System.out.printf("%s hasn't played any games during this season.",name);
        }else{
            System.out.printf("%s has won %.0f points during this season.%n",name,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %.0f%n",p1);
            System.out.printf("## D: %.0f%n",p2);
            System.out.printf("## L: %.0f%n",p3);
            System.out.printf("Win rate: %.2f%%",p1/n*100);
        }
    }
}
