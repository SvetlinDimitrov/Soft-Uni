package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = Integer.parseInt(scanner.nextLine());
        double studentAllGrades = 0;
        double SmallThreeGrade = 0;
        double ThreeFourGrade = 0;
        double FourFiveGrade = 0;
        double FiveSixGrade = 0;
        for (int i = 1; i <= student; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            studentAllGrades += grade;
            if (grade < 3) {
                SmallThreeGrade += 1;
            } else if (grade <= 3.99) {
                ThreeFourGrade += 1;
            } else if (grade <= 4.99) {
                FourFiveGrade += 1;
            } else {
                FiveSixGrade += 1;
            }
        }
        System.out.printf("Top students: %.2f%%%n", (FiveSixGrade / student) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (FourFiveGrade / student) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (ThreeFourGrade / student) * 100);
        System.out.printf("Fail: %.2f%%%n", (SmallThreeGrade / student) * 100);
        System.out.printf("Average: %.2f",(studentAllGrades/student));
    }
}
//Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
//Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
//Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
//Ред 4 -	"Fail: {по-малко от 3.00}%"
//Ред 5 -	"Average: {среден успех}"
