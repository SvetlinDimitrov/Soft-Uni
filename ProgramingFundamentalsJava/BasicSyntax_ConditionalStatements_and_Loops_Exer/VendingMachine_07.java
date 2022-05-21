package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String money = scanner.nextLine();
        double stackMoney = 0;

        while(!money.equals("Start")){
            double currentMoney = Double.parseDouble(money);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2 ) {
                stackMoney += currentMoney;
            }else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
            }
            money = scanner.nextLine();
        }
        String toEat = scanner.nextLine();
        double price =0;
        while(!toEat.equals("End")){
            switch(toEat){
                case "Nuts":
                    price =2;
                    if(price <= stackMoney){
                        stackMoney-=price;
                        System.out.println("Purchased Nuts");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price =0.7;
                    if(price <= stackMoney){
                        stackMoney-=price;
                        System.out.println("Purchased Water");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price =1.5;
                    if(price <= stackMoney){
                        stackMoney-=price;
                        System.out.println("Purchased Crisps");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price =0.8;
                    if(price <= stackMoney){
                        stackMoney-=price;
                        System.out.println("Purchased Soda");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price =1;
                    if(price <= stackMoney){
                        stackMoney-=price;
                        System.out.println("Purchased Coke");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }

            toEat= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",stackMoney);
    }
}
//0.1, 0.2, 0.5, 1, and 2 coins.
//only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively