package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_01;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        double sum = 0;
        int count = 0;
        while(!(commands.equals("special") || commands.equals("regular"))){
            double priceParts = Double.parseDouble(commands);
            count ++;
            if(priceParts > 0) {
                sum += priceParts;
            }else if (priceParts < 0){
                System.out.println("Invalid price!" );
            }else {
                System.out.println("Invalid order!" );
            }

            commands = scanner.nextLine();
        }
        if(count ==0 ){
            System.out.println("Invalid order!");
            return;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n",sum);
        double taxes = sum * 0.2;
        sum +=taxes;
        if(commands.equals("special")){
            sum = sum - (sum*0.1);
        }
        System.out.printf("Taxes: %.2f$%n",taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$",sum);
    }
}
