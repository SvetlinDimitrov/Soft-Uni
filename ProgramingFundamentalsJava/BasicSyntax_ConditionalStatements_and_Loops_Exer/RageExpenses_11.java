package ProgramingFundamentalsJava.BasicSyntax_ConditionalStatements_and_Loops_Exer;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameLost = Integer.parseInt(scanner.nextLine());
        double headPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHead = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;
        for (int i = 1; i <=gameLost ; i++) {
            if(i%2==0){
                countHead++;
            }
            if(i%3==0){
                countMouse++;
            }
            if (i%6==0){
                countKeyboard++;
            }
            if (i%12==0){
                countDisplay++;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.",countHead*headPrice*1.0 + countMouse*mousePrice +countDisplay *displayPrice + countKeyboard * keyboardPrice);
    }
}
//•	On the first input line - lost games count – integer in the range [0, 1000].
//•	On the second line – headset price - the floating-point number in the range [0, 1000].
//•	On the third line – mouse price - the floating-point number in the range [0, 1000].
//•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
//•	On the fifth line – display price - the floating-point number in the range [0, 1000].