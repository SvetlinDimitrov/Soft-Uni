package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int money = 0 ;
        double cargoSpace =0;
        double cargobus = 0;
        double cargokamion = 0;
        double cargoVlak = 0;
        for ( int i = 1 ; i<=n ; i++){
            int cargo = Integer.parseInt(scanner.nextLine());
            cargoSpace +=cargo ;
            if ( cargo <= 3 ) {
                cargobus +=cargo;
                money = money + (cargo * 200);
            }else if ( cargo <=11) {
                cargokamion+=cargo;
                money = money + (cargo * 175);
            }else {
                cargoVlak +=cargo;
                money = money + ( cargo * 120);
            }
        }
        double realMoney = money / cargoSpace;
        System.out.printf("%.2f%n",realMoney);
        System.out.printf("%.2f%%%n",(cargobus/cargoSpace)*100);
        System.out.printf("%.2f%%%n",(cargokamion/cargoSpace)*100);
        System.out.printf("%.2f%%",(cargoVlak/cargoSpace)*100);
    }
}
//•	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
//•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]

//•	До 3 тона – микробус (200 лева на тон)
//•	От 4 до 11 тона – камион (175 лева на тон)
//•	12 и повече тона – влак (120 лева на тон)