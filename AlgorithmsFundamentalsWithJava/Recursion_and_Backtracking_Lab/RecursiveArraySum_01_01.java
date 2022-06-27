package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum_01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(recursive(num , num.length-1));
    }
    public static int recursive (int [] num , int index){
        if(index < 0){
            return 0;
        }

        return num[index] + recursive(num , index-1);

    }
}
