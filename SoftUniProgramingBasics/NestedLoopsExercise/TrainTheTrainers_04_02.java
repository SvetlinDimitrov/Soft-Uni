package SoftUniProgramingBasics.NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers_04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();
        int count =0;
        double allSumGrades =0;
        while(!namePresentation.equals("Finish")){
            double sumGrades=0;
            count++;
            for (int i = 1; i <=n ; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sumGrades +=grades;
            }
            allSumGrades +=sumGrades/n;
            System.out.printf( "%s - %.2f.%n",namePresentation,sumGrades/n);
            namePresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",allSumGrades/count);
    }
}
