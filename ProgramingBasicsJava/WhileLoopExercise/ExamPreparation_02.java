package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badRating = Integer.parseInt(scanner.nextLine());
        int bad = 0 ;
        int tasks = 0;
        String lastProblem = "";
        boolean out = false ;
        double avaragerating = 0;

        String problem = scanner.nextLine();


        while(!problem.equals("Enough")){
            tasks+=1;
            int rating = Integer.parseInt(scanner.nextLine());
            avaragerating+=rating;
            if (rating <= 4 ){
                bad +=1 ;

            }
            if (bad>=badRating){
              out = true ;
              break;
            }
            lastProblem = problem;
            problem = scanner.nextLine();


        }
        if (out){
            System.out.printf("You need a break, %d poor grades.",badRating);
        }else {
            System.out.printf("Average score: %.2f%n",avaragerating/tasks);
            System.out.printf("Number of problems: %d%n",tasks);
            System.out.printf("Last problem: %s%n",lastProblem);
        }

    }
}
