package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int newV = Integer.parseInt(command.split(" ")[1]);
                numList.add(newV);
            } else {
                int passengers = Integer.parseInt(command);

                for (int i = 0; i <= numList.size() - 1; i++) {
                    if (numList.get(i) + passengers <= max) {
                        numList.set(i, numList.get(i) + passengers);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (Integer printNum : numList){
            System.out.printf("%d ",printNum);
        }
    }
}
