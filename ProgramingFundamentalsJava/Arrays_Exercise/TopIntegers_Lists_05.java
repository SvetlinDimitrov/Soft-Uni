package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TopIntegers_Lists_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String print ="";

        for (int i = 0; i <= num.size()-1; i++) {
            boolean notBigger = true;
            for (int j = i+1; j <=num.size()-1 ; j++) {
                if(!(num.get(i) > num.get(j))) {
                    notBigger = false;
                    break;
                }
            }
            if (notBigger){
                print += String.format("%d ",num.get(i) );
            }
        }
        System.out.println(print);
    }
}
