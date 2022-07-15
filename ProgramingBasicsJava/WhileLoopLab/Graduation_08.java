package SoftUniProgramingBasics.WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 1;
        double sum= 0 ;
        int badGrades =  0;
        boolean Elimination = false ;


        while(i <= 12){
            double grades = Double.parseDouble(scanner.nextLine());
            sum+=grades;
            if (grades < 4){
                badGrades++;
                if ( badGrades == 2){
                    Elimination = true;
                    break;
                }
            }
            i++;
        }
        if (Elimination){
            System.out.printf("%s has been excluded at %d grade",name , i-1);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f",name , sum/12);
        }
    }
}
