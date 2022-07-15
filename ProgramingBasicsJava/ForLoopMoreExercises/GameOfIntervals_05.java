package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double assemble = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers >= 0 && numbers <= 9) {
                assemble = assemble + (numbers * 0.2);
                p1 += 1;
            } else if (numbers >= 0 && numbers <= 19) {
                assemble = assemble + (numbers * 0.3);
                p2 += 1;
            } else if (numbers >= 0 && numbers <= 29) {
                assemble = assemble + (numbers * 0.4);
                p3 += 1;
            } else if (numbers >= 0 && numbers <= 39) {
                assemble = assemble + 50;
                p4 += 1;
            } else if (numbers >= 0 && numbers <= 50) {
                assemble = assemble + 100;
                p5 += 1;
            } else {
                assemble = assemble / 2;
                p6 += 1;
            }
        }
        System.out.printf("%.2f%n",assemble);
        System.out.printf("From 0 to 9: %.2f%%%n",(p1/n)*100);
        System.out.printf("From 10 to 19: %.2f%%%n",(p2/n)*100);
        System.out.printf("From 20 to 29: %.2f%%%n",(p3/n)*100);
        System.out.printf("From 30 to 39: %.2f%%%n",(p4/n)*100);
        System.out.printf("From 40 to 50: %.2f%%%n",(p5/n)*100);
        System.out.printf("Invalid numbers: %.2f%%%n",(p6/n)*100);

    }
}
//•	1ви ред: "{Краен резултат}"
//•	2ри ред: "From 0 to 9: {процент в интервала}%"
//•	3ти ред: "From 10 to 19: {процент в интервала}%"
//•	4ти ред: "From 20 to 29: {процент в интервала}%"
//•	5ти ред: "From 30 to 39: {процент в интервала}%"
//•	6ти ред: "From 40 to 50: {процент в интервала}%"
//•	7ми ред: "Invalid numbers: {процент в интервала}%"




//•	•	От 0 до 9  20 % от числото
//•	От 10 до 19  30 % от числото
//•	От 20 до 29  40 % от числото
//•	От 30 до 39  50 точки
//•	От 40 до 50  100 точки
//•	Невалидно число  резултата се дели на 2