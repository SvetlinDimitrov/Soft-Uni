package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        boolean flag = false ;
        double p1 =0 ;
        double p2 =0 ;
        double p3=0 ;
        int Alltickets = 0;

        while(!movie.equals("Finish")){
            int places = Integer.parseInt(scanner.nextLine());
            double placesMovie = 0;

            for (int i = 1; i <=places ; i++) {

                String ticket = scanner.nextLine();
                switch(ticket){
                    case "student":
                        p1++;
                        break;
                    case "standard":
                        p2++;
                        break;
                    case "kid":
                        p3++;
                        break;
                    case "End":
                        flag = true;
                        break;
                }
                if ( flag){
                    break;
                }
                Alltickets++;
                placesMovie++;

            }
            System.out.printf("%s - %.2f%% full.%n",movie,placesMovie/places*100);

            flag=false;
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",Alltickets);
        System.out.printf("%.2f%% student tickets.%n",p1/Alltickets*100);
        System.out.printf("%.2f%% standard tickets.%n",p2/Alltickets*100);
        System.out.printf("%.2f%% kids tickets.%n",p3/Alltickets*100);
    }
}
