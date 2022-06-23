package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootfortheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        int sum = 0;
        int shootCount = 0;
        while (!command.equals("End")) {
            int shoot = Integer.parseInt(command);
            if (shoot <= num.size() - 1) {
                if (num.get(shoot) != -1) {
                    sum += num.get(shoot);
                    for (int i = 0; i <= num.size() - 1; i++) {
                        if (num.get(i) != -1) {
                            if(i != shoot) {
                                if (num.get(shoot) >= num.get(i)) {
                                    num.set(i, num.get(i) + num.get(shoot));
                                } else {
                                    num.set(i, num.get(i) - num.get(shoot));
                                }
                            }
                        }
                    }
                    num.set(shoot, -1);
                    shootCount++;
                }
            }
            command = scanner.nextLine();
        }
        String print = "";
        for (Integer nums : num) {
            print += String.format("%d ", nums);
        }
        System.out.printf("Shot targets: %d -> %s", shootCount, print);
    }
}
