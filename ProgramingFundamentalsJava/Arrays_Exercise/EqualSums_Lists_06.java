package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EqualSums_Lists_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean print = false;
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i <= num.size()-1; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft+=num.get(j);
            }
            for (int j = i+1; j <= num.size()-1 ; j++) {
                sumRight += num.get(j);
            }

            if(sumLeft == sumRight){
                System.out.println(i);
                print = true;
                break;
            }
        }
        if(!print){
            System.out.println("no");
        }
    }
}
