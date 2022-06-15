package ProgramingFundamentalsJava.Lab_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end")){
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (commands.get(0)){
                case "Add":
                    int comAdd = Integer.parseInt(commands.get(1));
                    num.add(comAdd);
                    break;
                case "Remove":
                    int comRemove = Integer.parseInt(commands.get(1));
                    num.removeIf(n -> n==comRemove);
                    break;
                case "RemoveAt":
                    int comRemoveAt = Integer.parseInt(commands.get(1));
                    num.remove(comRemoveAt);
                    break;
                case "Insert":
                    int insertNumber = Integer.parseInt(commands.get(1));
                    int index = Integer.parseInt(commands.get(2));
                    num.add(index , insertNumber);
                    break;

            }

            input = scanner.nextLine();
        }
        for (Integer number : num){
            System.out.printf("%d ",number);
        }
    }
}
