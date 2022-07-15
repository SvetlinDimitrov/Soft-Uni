package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        boolean flag = false ;

        while(!name.equals("ACTION")){

            if(name.length() > 15){
                budget = budget - (budget *0.2);
            }else {
                double actorMoney = Double.parseDouble(scanner.nextLine());
                budget = budget - actorMoney ;
            }
                if (budget < 0){
                    flag = true;
                    break;
                }



            name = scanner.nextLine();
        }
        if (flag ) {
           System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }else{
            System.out.printf("We are left with %.2f leva.",budget);
        }
    }
}
