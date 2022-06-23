package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while(!commands.equals("end")){
            if(commands.contains("swap")){
                int index1 = Integer.parseInt(commands.split(" ")[1]);
                int index2 = Integer.parseInt(commands.split(" ")[2]);
                int saveNum = num.get(index1);
                num.set(index1 , num.get(index2));
                num.set(index2 , saveNum);
            }
            else if (commands.contains("multiply")){
                int index1 = Integer.parseInt(commands.split(" ")[1]);
                int index2 = Integer.parseInt(commands.split(" ")[2]);
                num.set(index1 , num.get(index1)*num.get(index2));
            }
            else if (commands.contains("decrease")){
                for (int i = 0; i <= num.size()-1; i++) {
                    num.set(i , num.get(i) -1);
                }
            }

            commands = scanner.nextLine();
        }
        String print = String.format("%s",num.get(0));
        for (int i = 1; i <= num.size()-1 ; i++) {
            print+=String.format(", %d",num.get(i));
        }
        System.out.println(print);
    }
}
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes element at the 1st index and multiply it with the element at 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1