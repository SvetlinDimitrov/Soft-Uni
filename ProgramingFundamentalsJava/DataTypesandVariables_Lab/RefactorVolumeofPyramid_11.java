package ProgramingFundamentalsJava.DataTypesandVariables_Lab;

import java.util.Scanner;

public class RefactorVolumeofPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double volume = Double.parseDouble(scanner.nextLine());
        volume = (length * width * volume) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
