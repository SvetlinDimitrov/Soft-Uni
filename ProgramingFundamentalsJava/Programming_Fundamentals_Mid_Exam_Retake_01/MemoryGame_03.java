package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        boolean end = false;
        int count = 0;
        while(!command.equals("end")){
            count++;
            int position1 = Integer.parseInt(command.split(" ")[0]);
            int position2 = Integer.parseInt(command.split(" ")[1]);

            if (position1 < 0 || position2 < 0 || position2 == position1){
                System.out.println("Invalid input! Adding additional elements to the board");
                int middle  = (int)Math.ceil(words.size()/2);
                String add = String.format ("-%da",count);
                words.add(middle , add);
                words.add(middle , add);

            }
            else if(words.get(position1).equals(words.get(position2))){
                System.out.printf("Congrats! You have found matching elements - %s!%n",words.get(position1));
                words.remove(Math.max(position1 , position2));
                words.remove(Math.min(position1 , position2));
            }else {
                System.out.println("Try again!");
            }
            if(words.isEmpty()){
                end = true;
                System.out.printf("You have won in %d turns!",count);
                break;
            }
            command = scanner.nextLine();
        }
        if(!end){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" " , words));
        }
    }
}
