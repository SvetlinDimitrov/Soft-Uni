package ProgramingFundamentalsJava.More_Exercise_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> copyDrum = new ArrayList<>();
        for (Integer copyNum :drumSet){
            copyDrum.add(copyNum);
        }
        String commands = scanner.nextLine();

        while (!commands.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(commands);
            for (int i = 0; i <= drumSet.size() - 1; i++) {
                int drum = drumSet.get(i) - hitPower;
                drumSet.set(i, drum);
            }
                for (int j = 0; j <=drumSet.size()-1 ; j++) {
                    if (drumSet.get(j) <= 0) {
                        if (moneyCheck(money, copyDrum.get(j))) {
                            double cost = copyDrum.get(j) * 3;
                            drumSet.set(j, copyDrum.get(j));
                            money -= cost;
                        } else {
                            drumSet.remove(j);
                            copyDrum.remove(j);
                        }
                    }
                }




            commands = scanner.nextLine();
        }
        for (Integer num : drumSet) {
            System.out.printf("%d ", num);
        }
        System.out.printf("%nGabsy has %.2flv.", money);
    }

    public static boolean moneyCheck(double money, int drum) {
        double cost = drum * 3;
        money = money - cost;
        if (money <= 0) {
            return false;
        } else {
            return true;

        }
    }
}
