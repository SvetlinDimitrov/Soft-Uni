package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameProduct = scanner.nextLine();
        int sum = Integer.parseInt(scanner.nextLine());
        shop(nameProduct , sum);
    }
    public static void shop(String item , int sum){
        double money = 0;
        switch (item){
            case "coffee":
                money = 1.50;
                break;
            case "water":
                money = 1.00;
                break;
            case "coke":
                money = 1.40;
                break;
            case "snacks":
                money = 2.00;
                break;
        }
        System.out.printf("%.2f", money*sum);
    }
}
//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00