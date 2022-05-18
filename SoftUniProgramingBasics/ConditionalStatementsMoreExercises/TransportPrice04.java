package SoftUniProgramingBasics.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dayOrnigth = scanner.nextLine();
        double taksiD = n * 0.79 + 0.7;
        double taksiN = n * 0.9 +0.7;
        double avtobusDN = n * 0.09 ;
        double vlakDN = n * 0.06 ;
        if (dayOrnigth.equals("day") && n<20) {
            System.out.printf("%.2f",taksiD);

        }else if (dayOrnigth.equals("night") && n<20) {
            System.out.printf("%.2f", taksiN);
        }else if ( n <100) {
            System.out.printf("%.2f", avtobusDN);
        }else {
            System.out.printf("%.2f",vlakDN);
        }
    }
}
