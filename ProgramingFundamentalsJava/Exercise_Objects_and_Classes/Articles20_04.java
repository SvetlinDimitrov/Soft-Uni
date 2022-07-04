package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles20_04 {
    static class Articles {
        private String title ;
        private String content;
        private String author;

        Articles (String titles , String counter, String author){
            this.title = titles;
            this.content = counter;
            this.author = author;
        }

        void getInfo(){
            System.out.printf("%s - %s: %s%n", this.title , this.content , this.author);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Articles> art = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            String command = scanner.nextLine();
            Articles item = new Articles (command.split(", ")[0],command.split(", ")[1],command.split(", ")[2]);
            art.add(item);


        }
        String com = scanner.nextLine();
        for(Articles item : art){
            item.getInfo();
        }
    }
}
