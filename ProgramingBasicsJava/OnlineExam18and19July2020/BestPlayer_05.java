package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String maxName = "";
        boolean goalss = false;

        while(!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if ( maxGoals < goals){
                maxGoals = goals;
                maxName = name;
            }
            if ( goals >= 10){
                goalss = true;
                break;
            }




            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",maxName);
         if ( maxGoals >=3){
             System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
         }else {
             System.out.printf("He has scored %d goals.",maxGoals);
         }
    }
}
