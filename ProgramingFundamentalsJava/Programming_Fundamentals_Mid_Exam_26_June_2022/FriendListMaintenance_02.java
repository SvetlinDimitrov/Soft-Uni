package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_26_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        int lost = 0;
        int black = 0;

        while(!commands.equals("Report")){
            if(commands.contains("Blacklist")){
                String nameBlacklist = commands.split(" ")[1];
                if(names.contains(nameBlacklist)){
                    int nameIndex = names.indexOf(nameBlacklist);
                    names.set(nameIndex , "Blacklisted");
                    System.out.printf("%s was blacklisted.%n",nameBlacklist);
                    black++;
                }else {
                    System.out.printf("%s was not found.%n",nameBlacklist);
                }
            }
            else if (commands.contains("Error")){
                int errorIndex = Integer.parseInt(commands.split(" ")[1]);
                if(errorIndex >= 0 && errorIndex <= names.size()-1){
                    if(!names.get(errorIndex).equals("Blacklisted")){
                        if(!names.get(errorIndex).equals("Lost")){
                            System.out.printf("%s was lost due to an error.%n",names.get(errorIndex));
                            names.set(errorIndex , "Lost");
                            lost++;
                        }
                    }
                }
            }
            else if (commands.contains("Change")){
                int changeIndex = Integer.parseInt(commands.split(" ")[1]);
                String newName = commands.split(" ")[2];
                if(changeIndex >= 0 && changeIndex <= names.size()-1){
                    System.out.printf("%s changed his username to %s.%n",names.get(changeIndex) , newName);
                    names.set(changeIndex , newName);
                }
            }


            commands = scanner.nextLine();

        }
        System.out.printf("Blacklisted names: %d%n",black);
        System.out.printf("Lost names: %d%n",lost);
        for (String name : names){
            System.out.printf("%s ",name);
        }
    }
}
//        ◦ "Blacklist {name}"
//        ◦ "Error {index}"
//        ◦ "Change {index} {new name}"
//        ◦ "Report"