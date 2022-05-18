package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allSteps = 0;
        boolean goal = false ;
        while(true){
            String steps = scanner.nextLine();
            if(steps.equals("Going home")){
                int stepsWalk = Integer.parseInt(scanner.nextLine());
                allSteps+=stepsWalk;
                if(allSteps > 10000){
                    goal = true;
                }
                break;
            }
            int stepsWalk = Integer.parseInt(steps);
            allSteps+=stepsWalk;
            if(allSteps > 10000){
                goal = true;
                break;
            }

        }
        if ( goal){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",allSteps - 10000);
        }else{
            System.out.printf("%d more steps to reach goal.",10000 - allSteps);
        }

    }
}
