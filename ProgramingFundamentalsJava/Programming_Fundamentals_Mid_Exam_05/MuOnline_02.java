package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> commands = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int hp = 100;
        int bitcoins = 0;
        boolean dead = false;
        for (int i = 0; i <= commands.size() - 1; i++) {
            if (commands.get(i).contains("potion")) {
                int heal = Integer.parseInt(commands.get(i).split(" ")[1]);
                if (heal + hp > 100) {

                    System.out.printf("You healed for %d hp.%n", 100-hp);
                    hp = 100;
                } else {
                    hp += heal;
                    System.out.printf("You healed for %d hp.%n", heal);
                }

                System.out.printf("Current health: %d hp.%n", hp);

            } else if (commands.get(i).contains("chest")) {
                int bit = Integer.parseInt(commands.get(i).split(" ")[1]);
                bitcoins += bit;
                System.out.printf("You found %d bitcoins.%n", bit);

            } else {
                String monsterName = commands.get(i).split(" ")[0];
                int attackMonster = Integer.parseInt(commands.get(i).split(" ")[1]);
                hp-=attackMonster;
                if (hp>0){
                    System.out.printf("You slayed %s.%n",monsterName);
                }else{
                    dead = true;
                    System.out.printf("You died! Killed by %s.%n",monsterName );
                    System.out.printf("Best room: %d",i+1);
                    break;
                }
            }

        }
        if(!dead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d",hp);
        }
    }
}
