package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("Go Shopping!")) {
            if (commands.contains("Urgent")) {
                String item = commands.split(" ")[1];
                if (!words.contains(item)) {
                    words.add(0, item);
                }
            } else if (commands.contains("Unnecessary")) {
                String remove = commands.split(" ")[1];
                words.remove(remove);
            } else if (commands.contains("Correct")) {
                String oldItem = commands.split(" ")[1];
                String newItem = commands.split(" ")[2];
                if(words.contains(oldItem)){
                    words.set(words.indexOf(oldItem),newItem );
                }
            } else if (commands.contains("Rearrange")) {
                String item = commands.split(" ")[1];
                if(words.contains(item)){
                    words.remove(item);
                    words.add(item);
                }
            }


            commands = scanner.nextLine();
        }
        String print = String.format ("%s",words.get(0));
        for (int i = 1; i <=words.size()-1 ; i++) {
            print+=String.format(", %s",words.get(i));
        }
        System.out.println(print);
    }
}
//•	"Urgent {item}" - add the item at the start of the list.  If the item already exists, skip this command.
//•	"Unnecessary {item}" - remove the item with the given name, only if it exists in the list. Otherwise, skip this command.
//•	"Correct {oldItem} {newItem}" - if the item with the given old name exists, change its name with the new one. Otherwise, skip this command.
//•	"Rearrange {item}" - if the grocery exists in the list, remove it from its current position and add it at the end of the list. Otherwise, skip this command.