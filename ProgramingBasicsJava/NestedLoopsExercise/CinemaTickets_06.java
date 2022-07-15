package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String finish = scanner.nextLine();
        double ticket1 = 0;
        double ticket2 =0;
        double ticket3 =0;


        while(!finish.equals("Finish")){
            String movie = finish;
            int places = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            double i =0;


            while(true){
                if(ticket.equals("End")){
                    break;
                }
                i++;

                switch(ticket){
                    case "student":
                        ticket1++;
                        break;
                    case "standard":
                        ticket2++;
                        break;
                    case "kid":
                        ticket3++;
                        break;
                }
                if ( i == places){
                    break;
                }
                ticket = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n",movie,i/places*100);



            finish = scanner.nextLine();
        }
        double allTickets = ticket1 + ticket2 + ticket3 ;
        System.out.printf("Total tickets: %.0f%n",allTickets);
        System.out.printf("%.2f%% student tickets.%n",ticket1/allTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",ticket2/allTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",ticket3/allTickets*100);
    }
}
