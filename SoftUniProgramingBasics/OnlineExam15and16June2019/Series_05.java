package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=series ; i++) {
            String nameSerial = scanner.nextLine();
            double budgetSerial = Double.parseDouble(scanner.nextLine());
            switch ( nameSerial){
                case "Thrones":
                    budgetSerial = budgetSerial - ( budgetSerial*0.5);
                    break;
                case "Lucifer":
                    budgetSerial = budgetSerial - ( budgetSerial*0.4);
                    break;
                case "Protector":
                    budgetSerial = budgetSerial - ( budgetSerial*0.3);
                    break;
                case "TotalDrama":
                    budgetSerial = budgetSerial - ( budgetSerial*0.2);
                    break;
                case "Area":
                    budgetSerial = budgetSerial - ( budgetSerial*0.1);
                    break;
            }
            budget = budget - budgetSerial;

        }
        if ( budget >= 0){
            System.out.printf("You bought all the series and left with %.2f lv.",budget);
        }else{
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(budget));
        }
    }
}
