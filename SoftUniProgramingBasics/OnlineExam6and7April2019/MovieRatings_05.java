package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberMovie = Integer.parseInt(scanner.nextLine());
        double averageRating = 0;
        double maxRating = Integer.MIN_VALUE;
        double minRating = Integer.MAX_VALUE;
        String maxMovie = "";
        String minMovie = "";

        for (int i = 1; i <=numberMovie ; i++) {
            String nameMovie = scanner.nextLine();
            double rating  = Double.parseDouble(scanner.nextLine());
            averageRating += rating;
            if ( maxRating < rating){
                maxRating = rating;
                maxMovie =nameMovie;

            }
            if ( minRating >rating ){
                minRating = rating;
                minMovie = nameMovie;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n",maxMovie,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",minMovie,minRating);
        System.out.printf("Average rating: %.1f",averageRating/numberMovie);
    }
}
