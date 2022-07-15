package SoftUniProgramingBasics.ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String ime = scanner.nextLine();
        if ( ime.equals("square")) {
            double chislo1 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f" ,chislo1*chislo1);

        } else if ( ime.equals("rectangle")) {
            double chislo1 = Double.parseDouble(scanner.nextLine());
            double chislo2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f" ,chislo1 * chislo2);

        } else if ( ime.equals("circle")) {
            double chislo1 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f" ,Math.PI * chislo1*chislo1);
        } else if (ime.equals("triangle")) {
            double chislo1 = Double.parseDouble(scanner.nextLine());
            double chislo2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f" , (chislo1*chislo2)/2);

        }
    }
}
