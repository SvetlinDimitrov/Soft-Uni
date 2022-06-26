package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_26_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckofCards_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= times; i++) {
            String commands = scanner.nextLine();

            if (commands.contains("Add")) {
                String addCard = commands.split(", ")[1];
                if (!cards.contains(addCard)) {
                    cards.add(addCard);
                    System.out.println("Card successfully added");
                } else {
                    System.out.println("Card is already in the deck");
                }
            } else if (commands.split(", ")[0].equals("Remove")) {
                String removeCard = commands.split(", ")[1];
                if (cards.contains(removeCard)) {
                    cards.remove(removeCard);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }
            } else if (commands.split(", ")[0].equals("Remove At")) {
                int removeIndex = Integer.parseInt(commands.split(", ")[1]);
                if (removeIndex >= 0 && removeIndex <= cards.size() - 1) {
                    cards.remove(removeIndex);
                    System.out.println("Card successfully removed");
                }else {
                    System.out.println("Index out of range");
                }
            } else if (commands.contains("Insert")) {
                int insertCard = Integer.parseInt(commands.split(", ")[1]);
                String nameCard = commands.split(", ")[2];
                if (insertCard >= 0 && insertCard <= cards.size() - 1) {
                    if(!cards.contains(nameCard)){
                        cards.add(insertCard , nameCard);
                        System.out.println("Card successfully added");
                    }else {
                        System.out.println("Card is already added");
                    }
                }else {
                    System.out.println("Index out of range");
                }
            }
        }
        String print = String.format("%s",cards.get(0));
        for (int i = 1; i <= cards.size()-1 ; i++) {
            print+=String.format(", %s",cards.get(i));
        }
        System.out.println(print);
    }
}
//        ◦ "Add, {CardName}"
//        ◦ "Remove, {CardName}"
//        ◦ "Remove At, {index}"
//        ◦ "Insert, {index}, {CardName}"