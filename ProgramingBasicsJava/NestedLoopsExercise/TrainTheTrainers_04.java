package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double averageGrade = 0;
        double sum = 0;
        double count = 0;
         while (!presentation.equals("Finish")){
             double grade = 0;
             count++;
             for (int i = 1; i <=n ; i++) {
                 double grades = Double.parseDouble(scanner.nextLine());
                grade +=grades;
                if(i==n) {
                    averageGrade = grade / n;
                    sum +=averageGrade;
                }
             }
                System.out.printf("%s - %.2f.%n",presentation,averageGrade);
             presentation = scanner.nextLine();
         }
         System.out.printf("Student's final assessment is %.2f.",sum/count);
    }
}
