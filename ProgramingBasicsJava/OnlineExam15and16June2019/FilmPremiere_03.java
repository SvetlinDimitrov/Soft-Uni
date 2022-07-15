package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String menu = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch(movieName){
            case "John Wick":
                switch(menu){
                    case "Drink":
                        price = 12;
                        break;
                    case "Popcorn":
                        price = 15;
                        break;
                    case "Menu":
                        price = 19;
                        break;
                }
                break;
            case "Star Wars":
                switch(menu){
                    case "Drink":
                        price = 18;
                        break;
                    case "Popcorn":
                        price = 25;
                        break;
                    case "Menu":
                        price = 30;
                        break;
                }
                break;
            case "Jumanji":
                switch(menu){
                    case "Drink":
                        price = 9;
                        break;
                    case "Popcorn":
                        price = 11;
                        break;
                    case "Menu":
                        price = 14;
                        break;
                }
                break;

        }
        price = price * tickets;
        if (movieName.equals("Star Wars") && tickets >=4){
            price = price - (price * 0.3);

        }else if (movieName.equals("Jumanji") && tickets ==2){
            price = price - (price * 0.15);
        }
        System.out.printf("Your bill is %.2f leva.",price);
    }
}
