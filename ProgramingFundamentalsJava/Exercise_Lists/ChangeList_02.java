package ProgramingFundamentalsJava.Exercise_Lists;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            if(command.contains("Delete")){
                int deleteNum = Integer.parseInt(command.split(" ")[1]);
                numList.removeAll(Arrays.asList(deleteNum));
            }else{
                int insertElement = Integer.parseInt(command.split(" ")[1]);
                int insertPosition = Integer.parseInt(command.split(" ")[2]);
                numList.add(insertPosition , insertElement);
            }


            command= scanner.nextLine();
        }
        for(Integer num : numList){
            System.out.printf("%d ",num);
        }
    }
}
