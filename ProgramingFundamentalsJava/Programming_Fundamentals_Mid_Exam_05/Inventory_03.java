package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.contains("Craft!")) {
            if (commands.contains("Collect")) {
                String itemCollect = commands.split(" - ")[1];
                if(!items.contains(itemCollect)){
                    items.add(itemCollect);
                }

            } else if (commands.contains("Drop")) {
                String itemDrop = commands.split(" - ")[1];
                items.remove(itemDrop);

            } else if (commands.contains("Combine Items")) {
                String secondCommand = commands.split(" - ")[1];
                String item1 = secondCommand.split(":")[0];
                String item2 = secondCommand.split(":")[1];
                if(items.contains(item1)){
                    int indexItem1 = items.indexOf(item1);
                    items.add(indexItem1+1  , item2);
                }

            } else if (commands.contains("Renew")) {
                String item = commands.split(" - ")[1];
                if(items.contains(item)){
                    items.remove(item);
                    items.add(item);
                }
            }

            commands = scanner.nextLine();
        }
        String print = String.format("%s",items.get(0));
        for (int i = 1; i <=items.size()-1 ; i++) {
            print+=String.format(", %s",items.get(i));
        }
        System.out.println(print);
    }
}
//•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists, you should skip this line.
//•	"Drop - {item}" - you should remove the item from your inventory if it exists.
//•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists. If so, add the new item after the old one. Otherwise, ignore the command.
//•	"Renew – {item}" – if the given item exists, you should change its position and put it last in your inventory.