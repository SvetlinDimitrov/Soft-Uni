package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("End")){
            if ( command.contains("Add")){
                int addNumber = Integer.parseInt(command.split(" ")[1]);
                numList.add(addNumber);
            }else if ( command.contains("Insert")){
                int insertNum = Integer.parseInt(command.split(" ")[1]);
                int insertIndex = Integer.parseInt(command.split(" ")[2]);
                if(ValidIndex(numList ,insertIndex )) {
                    numList.add(insertIndex, insertNum);
                }else{
                    System.out.println("Invalid index");
                }
            }else if ( command.contains("Remove")){
                int remove = Integer.parseInt(command.split(" ")[1]);
                if(ValidIndex(numList , remove)) {
                    numList.remove(remove);
                }else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")){
                int times = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < times; i++) {
                    numList.add(numList.get(0));
                    numList.remove(0);
                }
            }else{
                int times = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < times; i++) {
                    numList.add(0, numList.get(numList.size() - 1));
                    numList.remove(numList.size() - 1);
                }
            }



            command = scanner.nextLine();
        }
        for (Integer num : numList){
            System.out.printf("%d ",num);
        }
    }
    public static boolean ValidIndex(List<Integer> num , int index){
        return  index >= 0 && index <= num.size()-1 ;
    }
}
//•	Add {number} - add number at the end
//•	Insert {number} {index} - insert number at given index
//•	Remove {index} - remove that index
//•	Shift left {count} - first number becomes last 'count' times
//•	Shift right {count} - last number becomes first 'count' times