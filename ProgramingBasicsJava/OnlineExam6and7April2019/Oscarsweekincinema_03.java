package SoftUniProgramingBasics.OnlineExam6and7April2019;

import java.util.Scanner;

public class Oscarsweekincinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        String hole = scanner.nextLine();
        int sum = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (film){
            case "A Star Is Born" :
                switch (hole){
                    case "normal":
                        price = 7.5;
                        break;
                    case "luxury":
                        price = 10.5;
                        break;
                    case "ultra luxury":
                        price = 13.5;
                        break;
                }
                break;
            case "Bohemian Rhapsody" :
                switch (hole){
                    case "normal":
                        price = 7.35;
                        break;
                    case "luxury":
                        price = 9.45;
                        break;
                    case "ultra luxury":
                        price = 12.75;
                        break;
                }
                break;
            case "Green Book" :
                switch (hole){
                    case "normal":
                        price = 8.15;
                        break;
                    case "luxury":
                        price = 10.25;
                        break;
                    case "ultra luxury":
                        price = 13.25;
                        break;
                }
                break;
            case "The Favourite" :
                switch (hole){
                    case "normal":
                        price = 8.75;
                        break;
                    case "luxury":
                        price = 11.55;
                        break;
                    case "ultra luxury":
                        price = 13.95;
                        break;
                }
                break;

        }
        price = price * sum ;
        System.out.printf("%s -> %.2f lv.",film,price);
    }
}
