package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int [] wagon = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean stop = false ;
        for (int i = 0; i <=wagon.length-1 ; i++) {
            while(!(wagon[i] == 4)){
                people--;
                wagon[i]++;
                if ( people ==0){
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
        }
        if (!checkWagons(wagon) && checkPeople(people)){
            System.out.println("The lift has empty spots!");
            printWagon(wagon);
        }else if  (checkWagons(wagon) && !checkPeople(people)){
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
            printWagon(wagon);
        }else {
            printWagon(wagon);
        }
    }
    public static boolean checkWagons (int [] wagon ){
        boolean checkWagons = true;
        for (int i = 0; i <=wagon.length-1 ; i++) {
            if(!(wagon[i] == 4)){
                checkWagons = false;
            }
        }
        return checkWagons;
    }
    public static boolean checkPeople ( int people){
        boolean checkPeople = false;
        if(people ==0){
            checkPeople = true;
        }
        return  checkPeople;
    }
    public static void printWagon (int [] wagon) {
        for (Integer num :wagon){
            System.out.printf("%d ",num);
        }
    }
}
