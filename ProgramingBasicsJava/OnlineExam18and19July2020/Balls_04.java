package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double points  = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;


        for (int i = 1; i <= n ; i++) {
            String colors = scanner.nextLine();
            switch (colors){
                case "red" :
                    p1++;
                    points+=5;
                    break;
                case "orange" :
                    points+=10;
                    p2++;
                    break;
                case "yellow" :
                    p3++;
                    points+=15;
                    break;
                case "white" :
                    p4++;
                    points+=20;
                    break;
                case "black" :
                    p5++;
                    points = Math.floor(points/2);
                    break;
                default:
                    p6++;

            }
            
        }
        System.out.printf("Total points: %.0f%n",points);
        System.out.printf("Red balls: %d%n",p1);
        System.out.printf("Orange balls: %d%n",p2);
        System.out.printf("Yellow balls: %d%n",p3);
        System.out.printf("White balls: %d%n",p4);
        System.out.printf("Other colors picked: %d%n",p6);
        System.out.printf("Divides from black balls: %d",p5);
    }
}
