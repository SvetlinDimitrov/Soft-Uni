package AlgorithmsFundamentalsWithJava.Recursion_and_Backtracking_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         System.out.println(SumNum(numArray,numArray.length-1));
    }
    public static int SumNum (int [] num, int index){
        if (index == 0 ){
            return num[index];
        }

        return num[index] +SumNum(num , index-1);

    }
}
