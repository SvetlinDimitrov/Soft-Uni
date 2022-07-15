package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  movieName = scanner.nextLine();
        double maxNumber = Integer.MIN_VALUE;
        String maxName = "";
        int movieCount= 0;
        boolean flag = false;


        while(!movieName.equals("STOP")){
            movieCount++;
            if ( movieCount> 7){
                flag = true;
                break;
            }
            double Allpoints = 0;


            for (int i = 1; i <=movieName.length() ; i++) {
                int wordASCII = movieName.charAt(i-1);
                String UppName = movieName.toUpperCase();

                if(movieName.charAt(i-1) == UppName.charAt(i-1) ){
                    wordASCII = wordASCII - movieName.length();
                    Allpoints = Allpoints + wordASCII;
                }else{
                    wordASCII = wordASCII - (movieName.length()*2);
                    Allpoints = Allpoints + wordASCII;
                }
                if ( maxNumber < Allpoints){
                    maxNumber = Allpoints;
                    maxName = movieName;
                }
            }

            movieName= scanner.nextLine();
        }
        if ( flag){
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %.0f ASCII sum.",maxName,maxNumber);
    }
}
