package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <=students ; i++) {
            if(i%6==0){
                count++;
            }
        }
        double studentPlus= Math.ceil(students *0.1);
        double cost = (priceLight * (students +  studentPlus) )+ (priceRobes * students) + (priceBelts * (students-count));
        if ( money >= cost){
            System.out.printf("The money is enough - it would cost %.2flv.",cost);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",cost-money);
        }
    }
}
//•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
//•	The count of students – integer in the range [0…100].
//•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
//•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
//•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

//sabresPrice * (studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)