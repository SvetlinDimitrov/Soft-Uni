package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class MovieDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timePicture = Integer.parseInt(scanner.nextLine());
        int scene = Integer.parseInt(scanner.nextLine());
        int timeScene = Integer.parseInt(scanner.nextLine());

        double p1 =(timePicture*0.15);
        double pictures = scene * timeScene ;
        double allTime = p1 + pictures;

        if (allTime > timePicture){
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",allTime - timePicture);
        }else{
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timePicture - allTime);
        }
    }
}
