package ProgramingFundamentalsJava.Exercise_Regular_Expressions;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        List<Character> charList = new ArrayList<>();
        charList.add('s');
        charList.add('t');
        charList.add('a');
        charList.add('r');
        charList.add('S');
        charList.add('T');
        charList.add('A');
        charList.add('R');
        int times = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<namePlanet>[A-Za-z]+)\\w*\\W*:(?<population>\\d+)\\w*\\W*!(?<type>[A-Z]?)!\\w*\\W*->(?<soldier>\\d+)");
        List<String> destroy = new ArrayList<>();
        List<String> attack = new ArrayList<>();

        for (int j = 0; j < times; j++) {
            String input = scanner.nextLine();
            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (charList.contains(currentChar)) {
                    count++;
                }
            }

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                char dec = (char) ((int) currentChar - count);
                word.append(dec);
            }
            Matcher matcher= pattern.matcher(word);
            if(matcher.find()){
                String name = matcher.group("namePlanet");
                int population =Integer.parseInt( matcher.group("population"));
                String action = matcher.group("type");
                int soldier = Integer.parseInt(matcher.group("soldier"));
                if(action.equals("D")){
                    destroy.add(0,name);
                }else if (action.equals("A")){
                    attack.add(0,name);
                }
            }
            word.delete(0 , word.length());
        }
        System.out.printf("Attacked planets: %d%n",attack.size());
        if(!attack.isEmpty()){
            for (String attackPrint : attack){
                System.out.printf("-> %s%n",attackPrint);
            }
        }
        System.out.printf("Destroyed planets: %d%n",destroy.size());
        if(!destroy.isEmpty()){
            for(String destroyPrint : destroy){
                System.out.printf("-> %s%n",destroyPrint);
            }
        }
    }
}
