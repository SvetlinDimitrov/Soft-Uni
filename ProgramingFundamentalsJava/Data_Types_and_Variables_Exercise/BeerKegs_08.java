package ProgramingFundamentalsJava.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberKegs = Integer.parseInt(scanner.nextLine());
        String maxKegName = "";
        double maxSum = Double.MIN_VALUE;

        for (int i = 0; i < numberKegs; i++) {
            double sum = 0;
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            sum = Math.PI * Math.pow(radius , 2) * height;
            if ( maxSum < sum){
                maxKegName = modelKeg;
                maxSum = sum;
            }

        }
        System.out.println(maxKegName);
    }
}
// π * r^2 * h.