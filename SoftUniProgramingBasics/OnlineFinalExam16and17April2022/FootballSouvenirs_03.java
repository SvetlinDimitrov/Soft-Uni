package SoftUniProgramingBasics.OnlineFinalExam16and17April2022;

import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        boolean teamFlag = false;
        boolean typeFlag = false;


        double price = 0;
        switch (team) {
            case "Argentina":
                switch (type) {
                    case "flags":
                        price = 3.25;
                        break;
                    case "caps":
                        price = 7.20;
                        break;
                    case "posters":
                        price = 5.10;
                        break;
                    case "stickers":
                        price = 1.25;
                        break;
                    default:
                        typeFlag = true;
                }
                break;
            case "Brazil":
                switch (type) {
                    case "flags":
                        price = 4.20;
                        break;
                    case "caps":
                        price = 8.50;
                        break;
                    case "posters":
                        price = 5.35;
                        break;
                    case "stickers":
                        price = 1.20;
                        break;
                    default:
                        typeFlag = true;
                }
                break;
            case "Croatia":
                switch (type) {
                    case "flags":
                        price = 2.75;
                        break;
                    case "caps":
                        price = 6.90;
                        break;
                    case "posters":
                        price = 4.95;
                        break;
                    case "stickers":
                        price = 1.10;
                        break;
                    default:
                        typeFlag = true;
                }
                break;
            case "Denmark":
                switch (type) {
                    case "flags":
                        price = 3.10;
                        break;
                    case "caps":
                        price = 6.50;
                        break;
                    case "posters":
                        price = 4.8;
                        break;
                    case "stickers":
                        price = 0.9;
                        break;
                    default:
                        typeFlag = true;
                }
                break;
            default:
                teamFlag = true;
        }
        price *= number;

        if (teamFlag) {
            System.out.println("Invalid country!");

        } else if (typeFlag) {
            System.out.println("Invalid stock!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", number, type, team, price);
        }
    }
}
//•	Първият ред – отбор – текст с възможности: "Argentina", "Brazil", "Croatia", "Denmark"
//•	Вторият ред – вид сувенири – текст с възможности: "flags", "caps", "posters", "stickers"
//•	Третият ред – брой закупени сувенири – цяло число в интервала [1…200]