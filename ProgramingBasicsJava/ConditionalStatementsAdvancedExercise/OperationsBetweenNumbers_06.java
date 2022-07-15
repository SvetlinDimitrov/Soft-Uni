package SoftUniProgramingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double N3 = 0;
        String evenOrodd = "";
        boolean isTrue = false ;
        switch (symbol) {
            case "+":
                N3 = N1 + N2;
                break;
            case "-":
                N3 = N1 - N2;
                break;
            case "*":
                N3 = N1 * N2;
                break;
            case "/":
                if (N2 == 0){
                    isTrue = true ;
                } else {
                    N3 = N1 * 1.0 / N2;
                }
                break;
            case "%":
                if (N2 == 0){
                    isTrue = true ;
                } else {
                    N3 = N1 % N2;
                }
                break;
        }
        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {
            if (N3 % 2 == 0) {
                evenOrodd = "even";
            } else {
                evenOrodd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", N1, symbol, N2, N3, evenOrodd);
        } else if (symbol.equals("/") && !isTrue) {
            System.out.printf("%d / %d = %.2f", N1, N2, N3);
        } else if (symbol.equals("%") && !isTrue) {
            System.out.printf("%d %% %d = %d", N1, N2, N1 % N2);
        } else {
            System.out.printf("Cannot divide %d by zero",N1);
        }
    }
}
//•	N1 – цяло число в интервала [0...40 000]
//•	N2 – цяло число в интервала [0...40 000]
//•	Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“

//: Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).