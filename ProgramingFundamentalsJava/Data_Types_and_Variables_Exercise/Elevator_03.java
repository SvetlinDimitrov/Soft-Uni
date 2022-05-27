package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(numberPeople*1.0/capacityElevator);
        System.out.printf("%.0f",courses);
    }
}
