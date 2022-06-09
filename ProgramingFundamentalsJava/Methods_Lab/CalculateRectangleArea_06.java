package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [2];
        for (int i = 0; i < 2; i++) {
            numbers [i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println(Triangle(numbers));
    }
    public static int Triangle (int [] array){
        return (array[0] * array[1]);
    }
}
