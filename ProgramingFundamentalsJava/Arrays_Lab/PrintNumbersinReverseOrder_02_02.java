package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        revurseText(times , scanner);
    }
    public static void revurseText (int times , Scanner scanner ){
        String [] revurse  = new String [times];
        for (int i = 0; i < times; i++) {
            revurse [i] = scanner.nextLine();
        }
        for (int i = revurse.length-1; i >= 0 ; i--) {
            System.out.printf("%s ",revurse[i]);
        }
    }
}
