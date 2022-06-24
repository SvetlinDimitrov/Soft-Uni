package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();
        int jumpSum = 0;
        while(!commands.equals("Love!")){
            if (commands .contains("Jump")){
                int jump = Integer.parseInt(commands.split(" ")[1]);
                jumpSum+=jump;

                if(jumpSum > num.size()-1){
                    jumpSum=0;
                }
                if(num.get(jumpSum) == 0){
                    System.out.printf("Place %d already had Valentine's day.%n",jumpSum);
                }else if (num.get(jumpSum) != 0 ) {
                    num.set(jumpSum, num.get(jumpSum) - 2);
                    if (num.get(jumpSum) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", jumpSum);
                    }
                }
            }


            commands = scanner.nextLine();
        }
        boolean love = true;
        int countFaild = 0;
        System.out.printf("Cupid's last position was %d.%n",jumpSum);
        for (int i = 0; i <= num.size()-1; i++) {
            if(num.get(i) != 0){
                love = false;
                countFaild++;
            }
        }
        if(love){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.",countFaild);
        }
    }
}
