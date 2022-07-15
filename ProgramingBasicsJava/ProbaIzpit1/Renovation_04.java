package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int sh = Integer.parseInt(scanner.nextLine());
        int wall = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();
        double wallLong = v * sh * 4;
        wallLong = wallLong - (wallLong * wall/100);
        boolean paintLeft = false;
        boolean All = false;

        while (!number.equals("Tired!")) {
            double paint = Double.parseDouble(number);
            wallLong = wallLong - paint;
            if (wallLong <= 0) {
                paintLeft = true;
                break;
            }



            number = scanner.nextLine();
        }
        if ( wallLong == 0 ){
            System.out.println("All walls are painted! Great job, Pesho!");

        }else if ( paintLeft){
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(wallLong));
        }
        if (number.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.",wallLong);
        }
    }
}
