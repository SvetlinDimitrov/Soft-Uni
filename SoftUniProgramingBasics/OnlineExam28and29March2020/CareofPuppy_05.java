package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class CareofPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food = Integer.parseInt(scanner.nextLine());
        String eatenFood = scanner.nextLine();
        double allFood = 0;

        while(!eatenFood.equals("Adopted")){
            double allfood = Double.parseDouble(eatenFood);
            allFood+=allfood;



            eatenFood= scanner.nextLine();
        }
        food = food *1000;
        if (food >= allFood){
            System.out.printf("Food is enough! Leftovers: %.0f grams.",food - allFood);
        }else {
            System.out.printf("Food is not enough. You need %.0f grams more.",Math.abs(food - allFood));
        }
    }
}
