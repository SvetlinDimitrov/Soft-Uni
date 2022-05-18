package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Money = Integer.parseInt(scanner.nextLine());
        String movie = scanner.nextLine();
        int movietckiet = 0;
        int pop = 0;
        double value = 0;
        double Allmoney = Money;

        while (!movie.equals("End")) {
            int numberMovie = movie.length();
            if (numberMovie > 8) {
                int ASCII = movie.charAt(0);
                int ASCII2 = movie.charAt(1);
                value = value + ASCII + ASCII2;
                if (value < Allmoney) {
                    Allmoney = Allmoney - value;
                    movietckiet++;
                }else{
                    break;
                }
            } else {
                int ASCII = movie.charAt(0);
                value = value + ASCII;
                if (value < Allmoney) {
                    Allmoney = Allmoney - value;
                    pop++;
                } else {
                    break;
                }



            }
            value=0;
            movie = scanner.nextLine();
        }
        System.out.printf("%d%n%d", movietckiet, pop);
    }
}


