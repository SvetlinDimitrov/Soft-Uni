package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] loots = scanner.nextLine().split("\\|");
        String[] commands = scanner.nextLine().split(" ");
        boolean failed = false;


        while (!commands[0].equals("Yohoho!")) {
            String forEnd ="";


            if (commands[0].equals("Loot")) {

                for (int i = 1; i <= commands.length - 1; i++) {
                    boolean haveTheLoot = false;
                    for (int j = 0; j <= loots.length - 1; j++) {
                        if (commands[i].equals(loots[j])) {
                            haveTheLoot = true;
                        }
                    }
                    if (!haveTheLoot) {
                        String newLoot = commands[i];
                        String[] copy = new String[loots.length + 1];
                        System.arraycopy(loots, 0, copy, 1, copy.length - 1);
                        copy[0] = newLoot;
                        loots = copy;
                    }
                }
            }
            if (commands[0].equals("Drop")) {
                int n = Integer.parseInt(commands[1]);
                if (n == loots.length - 1 || n > loots.length - 1 || n < 0) {
                    commands = scanner.nextLine().split(" ");
                    continue;
                } else {
                    String copy = loots[n];
                    System.arraycopy(loots, n + 1, loots, n, loots.length -1-n );
                    loots[loots.length - 1] = copy;
                }

            }
            if (commands[0].equals("Steal")) {
                int n = Integer.parseInt(commands[1]);
                if (n >= loots.length - 1) {
                    forEnd = loots[0];
                    for (int i = 1; i < loots.length; i++) {
                        forEnd += String.format(", %s",loots[i]);
                    }

                    failed = true;
                    System.out.println(forEnd);
                    break;
                } else {
                    String[] newLoot = new String[loots.length- n];
                    System.arraycopy(loots, 0, newLoot, 0, newLoot.length  );
                    String [] lostLoot = new String [n];
                    System.arraycopy(loots,loots.length-n,lostLoot,0,n);
                    forEnd = lostLoot[0];
                    for (int i = 1; i <= lostLoot.length-1; i++) {
                        forEnd += String.format(", %s",lostLoot[i]);
                    }
                    System.out.println(forEnd);
                    loots = newLoot;
                }
            }
            commands = scanner.nextLine().split(" ");
        }
        if(failed){
            System.out.println("Failed treasure hunt.");

        }else{
            int maxSum = 0;
            for (int i = 0; i <= loots.length-1 ; i++) {
                int len = loots[i].length();
                maxSum+=len;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.",maxSum*1.0/ loots.length);
        }

    }
}

