package SoftUniProgramingBasics.OnlineExam28and29March2020;

import java.util.Scanner;

public class FoodforPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double cat = 0;
        double dog = 0;
        double surprise = 0;

        for (int i = 1; i <=days ; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            cat +=catFood;
            dog +=dogFood;

            if (i == 3  ){
                surprise = (dogFood + catFood)*0.1 ;
            }


        }
        double eatenFood = cat+dog;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",surprise);
        System.out.printf("%.2f%% of the food has been eaten.%n",(eatenFood/allFood)*100);
        System.out.printf("%.2f%% eaten from the dog.%n",(dog/eatenFood)*100);
        System.out.printf("%.2f%% eaten from the cat.%n",(cat/eatenFood)*100);
    }
}
