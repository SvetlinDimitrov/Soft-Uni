package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_03;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();
        int count = 0;
        boolean outOfEnergy = false;

        while(!commands.equals("End of battle")){
            int distance = Integer.parseInt(commands);
            if(count%3 == 0){
                energy+=count;
            }

            if(energy < distance){
                outOfEnergy=true;
                break;
            }else {
                energy-=distance;
                count++;
            }
            commands = scanner.nextLine();
        }
        if(outOfEnergy){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",count,energy);
        }else{
            System.out.printf("Won battles: %d. Energy left: %d",count,energy);
        }
    }
}
