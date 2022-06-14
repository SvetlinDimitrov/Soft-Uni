package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CondenseArraytoNumber_List_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int size = num.size();
        if(size == 1){
            System.out.printf("%d",num.get(0));
            return;
        }
        for (int j = num.size()-1; j >= 1 ; j--) {

            for (int i = 0; i < num.size()-1; i++) {
                num.set(i, num.get(i) + num.get(i + 1));

            }
            num.remove(num.size()-1);
        }
        System.out.printf("%d",num.get(0));
    }
}
