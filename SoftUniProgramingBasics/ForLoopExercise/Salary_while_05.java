package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class Salary_while_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while(i<=n){
            String fine =scanner.nextLine();
            switch(fine){
                case "Facebook" :
                    salary -=150;
                    break;
                case "Instagram" :
                    salary -=100;
                    break;
                case "Reddit" :
                    salary -=50;
                    break;

            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
            }
            i++;
        }
        System.out.printf("%d",salary);
    }
}
