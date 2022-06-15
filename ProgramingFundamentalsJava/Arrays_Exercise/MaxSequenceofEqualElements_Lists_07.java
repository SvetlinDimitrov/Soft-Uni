package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxSequenceofEqualElements_Lists_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count =0;
        int maxCount =0;
        List<Integer> numCopy = new ArrayList<>();
        for (int i = num.size()-1; i > 0 ; i--) {

            if (num.get(i).equals(num.get(i-1))){
                count++;
                if(maxCount<= count){
                    numCopy.clear();
                    maxCount = count;
                    numCopy.add(num.get(i));
                }
            }else{
                count = 0;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            numCopy.add(numCopy.get(0));
        }
        for (Integer numi : numCopy){
            System.out.printf("%d ",numi);

        }
    }
}
