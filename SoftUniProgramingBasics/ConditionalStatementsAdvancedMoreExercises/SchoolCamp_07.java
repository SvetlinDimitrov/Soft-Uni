package SoftUniProgramingBasics.ConditionalStatementsAdvancedMoreExercises;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String sex = scanner.nextLine();
        int student = Integer.parseInt(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());
        double priceForTheNight = 0;
        String sport = "";
        switch (season) {
            case "Winter" :
                if(sex.equals("boys") || sex.equals("girls") )
                    priceForTheNight = 9.6 * night * student;
                else {
                    priceForTheNight = 10 * night * student;
                }
                if(sex.equals("boys")) {
                    sport = "Judo" ;
                }else if (sex.equals("girls")) {
                    sport = "Gymnastics" ;
                }else {
                    sport = "Ski" ;
                }
                break;
            case "Spring" :
                if(sex.equals("boys") || sex.equals("girls") )
                    priceForTheNight = 7.2 * night * student ;
                else {
                    priceForTheNight = 9.5 * night * student ;
                }
                if(sex.equals("boys")) {
                    sport = "Tennis" ;
                }else if (sex.equals("girls")) {
                    sport = "Athletics" ;
                }else {
                    sport = "Cycling" ;
                }
                break;
            case "Summer" :
                if(sex.equals("boys") || sex.equals("girls") )
                    priceForTheNight = 15 * night * student;
                else {
                    priceForTheNight = 20 * night * student ;
                }
                if(sex.equals("boys")) {
                    sport = "Football" ;
                }else if (sex.equals("girls")) {
                    sport = "Volleyball" ;
                }else {
                    sport = "Swimming" ;
                }
                break;
        }
        if (student >= 10 && student <20){
            priceForTheNight = priceForTheNight - (priceForTheNight*0.05) ;
        }else if (student >=20 && student <50) {
            priceForTheNight = priceForTheNight - (priceForTheNight*0.15) ;
        }else if (student >= 50){
            priceForTheNight = priceForTheNight - (priceForTheNight*0.5) ;
        }
        System.out.printf("%s %.2f lv.",sport , priceForTheNight);
    }
}
//1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
//2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
//3.	Брой на учениците – цяло число в интервала [1 … 10000];
//4.	Брой на нощувките – цяло число в интервала [1 … 100].

//•	Ако броят на учениците е 50 или повече, училището получава 50% отстъпка
//•	Ако броят на учениците е 20 или повече и в същото време по-малък от 50, училището получава 15% отстъпка
//•	Ако броят на учениците е 10 или повече и в същото време по-малък от 20, училището получава 5% отстъпка