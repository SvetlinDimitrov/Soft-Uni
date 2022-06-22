package ProgramingFundamentalsJava.More_Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int middleIndex = (int)Math.ceil(num.size() /2);
        double player1 =speed(num, 0 ,middleIndex);
        double player2 = speed(num , middleIndex+1 , num.size());

        if(player1 < player2){
            System.out.printf("The winner is left with total time: %.1f",player1);
        }else{
            System.out.printf("The winner is right with total time: %.1f",player2);
        }

    }
    public static double speed (List<Integer> num , int startIndex, int endIndex){
        double speed = 0;
        for (int i = startIndex; i <endIndex ; i++) {
            if(num.get(i) == 0){
                speed *= 0.8;
            }else {
                speed += num.get(i);
            }
        }
        return speed;
    }
}
