package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Graduation_02_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i =1 ;
        boolean badGrades = false;
        int badboy = 0;
        double sum = 0;


        while ( i <= 12){
            double grades = Double.parseDouble(scanner.nextLine());
            if ( grades < 4){
                badboy+=1 ;
                if( badboy > 1){
                    badGrades = true ;
                    break;
                }
            }
            sum += grades;
            i++;
        }
        if ( badGrades){
            System.out.printf("%s has been excluded at %d grade",name,i-1);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f",name,sum/12);
        }

    }
}
