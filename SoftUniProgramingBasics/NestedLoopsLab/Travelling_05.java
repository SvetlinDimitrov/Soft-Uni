package SoftUniProgramingBasics.NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        while ( !city.equals("End")){
            int allMoney = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            while (allMoney > sum){
                int money = Integer.parseInt(scanner.nextLine());
                sum +=money;
            }
                System.out.printf("Going to %s!%n",city);
            city = scanner.nextLine();
        }
    }
}
