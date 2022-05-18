package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int allTickets = 0;
        double student =0;
        double standart = 0;
        double kids =0;

        while(!movie.equals("Finish")){
            int freeSits = Integer.parseInt(scanner.nextLine());
            int count = 0;


            for (int i =1; i <=freeSits ; i++) {
                String ticket = scanner.nextLine();
                if ( ticket.equals("End")) {
                    break;
                }
                count++;
                switch (ticket){
                    case "standard":
                        standart++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
            }

            allTickets +=count;
            System.out.printf("%s - %.2f full.%n",movie,count/freeSits*100.0);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",allTickets);
        System.out.printf("%.2f%% student tickets.%n",student/allTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",standart/allTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",kids/allTickets*100);
    }
}
