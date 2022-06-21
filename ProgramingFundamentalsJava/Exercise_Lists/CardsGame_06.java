package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.remove(0);
                player1.add(player2.get(0));
                player2.remove(0);
            } else if (player1.get(0) < player2.get(0)) {
                player2.add(player2.get(0));
                player2.remove(0);
                player2.add(player1.get(0));
                player1.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }
        int sum = 0;

        if(player1.isEmpty()){
            for (Integer num : player2){
                sum+=num;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }else {
            for (Integer num : player1) {
                sum += num;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}
