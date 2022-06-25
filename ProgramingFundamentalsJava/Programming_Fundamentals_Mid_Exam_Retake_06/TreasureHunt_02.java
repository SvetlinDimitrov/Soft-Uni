package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();
        boolean Treasured = true;

        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {
                List<String> itemsToAdd = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
                itemsToAdd.remove(0);
                for (int i = 0; i <= itemsToAdd.size() - 1; i++) {
                    if (!words.contains(itemsToAdd.get(i))) {
                        words.add(0, itemsToAdd.get(i));
                    }
                }
            } else if (command.contains("Drop")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (indexToRemove < words.size() - 1 && indexToRemove > 0) {
                    String save = words.get(indexToRemove);
                    words.remove(indexToRemove);
                    words.add(save);
                }
            } else if (command.contains("Steal")) {
                String stolen = "";
                int steal = Integer.parseInt(command.split(" ")[1]);
                if (steal > words.size() - 1) {
                    stolen += String.format("%s", words.get(0));
                    words.set(0 , "  ");
                    for (int i = 1; i <= words.size()-1; i++) {
                        stolen += String.format(", %s", words.get(i));
                        words.set(i , "  ");
                    }
                    words.removeIf(n-> n.equals("  "));
                    Treasured = false;
                    System.out.println(stolen);
                } else {
                    stolen += String.format("%s", words.get(words.size() - steal));
                    words.set(words.size() - steal , "  ");
                    for (int i = words.size()  - steal +1 ; i <= words.size() - 1; i++) {
                        stolen += String.format(", %s", words.get(i));
                        words.set(i , "  ");
                    }
                    words.removeIf(n-> n.equals("  "));
                    System.out.println(stolen);
                }
            }


            command = scanner.nextLine();
        }
        if(Treasured){
            int digitSum = 0;
            for (int i = 0; i <= words.size()-1; i++) {
                digitSum+= words.get(i).length();
            }
            double tresureGained = digitSum*1.0/ words.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",tresureGained);
        }else{
            System.out.println("Failed treasure hunt.");
        }
    }
}
