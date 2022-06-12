package ProgramingFundamentalsJava.More_Exercises_Methods;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minCoordinate = Double.MAX_VALUE;
        String Coordinate = "";
        for (int i = 1; i <= 2; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());

            double result = Closest(x,y);
            if (result < minCoordinate){
                minCoordinate = result;
                Coordinate = String.format("(%d, %d)",x,y);
            }

        }
        System.out.println(Coordinate);
    }
    public static double Closest (int x ,  int y){
       return   Math.sqrt((Math.pow(x , 2)) + Math.pow(y , 2));

    }
}
