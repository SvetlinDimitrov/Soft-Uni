package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thing = scanner.nextLine();
        String smallBig = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch(thing){
            case "Watermelon":
                if (smallBig.equals("small")){
                    price =56 *2;
                }else{
                    price=28.70*5;
                }
                break;
            case "Mango":
                if (smallBig.equals("small")){
                    price =36.66*2;
                }else{
                    price =19.6*5;
                }
                break;
            case "Pineapple":
                if (smallBig.equals("small")){
                    price =42.10*2;
                }else{
                    price =24.80*5;
                }
                break;
            case "Raspberry":
                if (smallBig.equals("small")){
                    price =20*2;
                }else{
                    price =15.20*5;
                }
                break;

        }
        price = price * number ;
        if (price >=400 && price <=1000){
            price = price - (price * 0.15);
        }else if ( price > 1000){
            price = price - ( price * 0.5);
        }
System.out.printf("%.2f lv.",price);
    }
}
//Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
//2. Размерът на сета - текст с възможности: "small" или "big"
//3. Брой на поръчаните сетове - цяло число в интервала [1 … 10000]