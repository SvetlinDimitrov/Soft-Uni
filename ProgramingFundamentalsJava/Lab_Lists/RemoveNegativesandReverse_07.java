package ProgramingFundamentalsJava.Lab_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesandReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        num.removeIf(n->n<0);
        if(num.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(num);
            for (Integer print : num){
                System.out.printf("%d ",print);
            }
        }
    }
}
