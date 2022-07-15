package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTickets = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double TicketsDays = priceTickets * tickets;
        double Income = TicketsDays * days;
        double inTheEnd = Income - (Income * p/100);

        System.out.printf("The profit from the movie %s is %.2f lv.",name,inTheEnd);
    }
}
