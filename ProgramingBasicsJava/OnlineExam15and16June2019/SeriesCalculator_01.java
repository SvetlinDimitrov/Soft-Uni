package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int ep = Integer.parseInt(scanner.nextLine());
        double epnoreklami = Double.parseDouble(scanner.nextLine());


        double rekalmi = (epnoreklami*0.20) ;
        double allEpisodes = epnoreklami + rekalmi;
        double specEp = seasons * 10;
        double All = (allEpisodes * seasons * ep ) + specEp;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name , All);
    }
}
