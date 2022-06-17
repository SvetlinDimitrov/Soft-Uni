package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String numbers = scanner.nextLine();

        int specialNum = Integer.parseInt(numbers.split(" ")[0]);
        int specialDetonate = Integer.parseInt(numbers.split(" ")[1]);
        int index = 0;

        for (int i = 0; i <= numList.size()-1; i++) {
            if(numList.get(i)==specialNum){
                index =i;
                break;
            }
        }
        if(index+specialDetonate > numList.size()-1){
            numList.removeAll(numList.subList(3 , numList.size()-1));
        }else{
            numList.removeAll(numList.subList());
        }
        System.out.println();

    }
}
