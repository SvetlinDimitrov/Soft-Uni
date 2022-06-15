package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_Lists_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> words = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            if(commands.get(0).equals("swap")){
                int firstNum = Integer.parseInt(commands.get(1));
                int secondNum = Integer.parseInt(commands.get(2));
                int saveNum = words.get(firstNum);
                words.set(firstNum , words.get(secondNum));
                words.set(secondNum, saveNum);
            }
            if(commands.get(0).equals("multiply")) {
                int firstNum = Integer.parseInt(commands.get(1));
                int secondNum = Integer.parseInt(commands.get(2));
                words.set(firstNum , words.get(firstNum)*words.get(secondNum));
            }
            if(commands.get(0).equals("decrease")) {
                for (int i = 0; i <= words.size()-1; i++) {
                    words.set(i,words.get(i) - 1);
                }
            }

            input = scanner.nextLine();
        }
        for (Integer numPrint : words){
            System.out.printf(", %d",numPrint);
        }
    }
}
