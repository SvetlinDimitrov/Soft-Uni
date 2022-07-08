package AlgorithmsFundamentalsWithJava.Lab_Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] index = new int [num.length];
        int [] prev = new int  [num.length];
        Arrays.fill(index , 1);
        Arrays.fill(prev , -1);
        for (int i = 1; i < num.length; i++) {

            for (int j = 0; j <= i; j++) {
                if(num[i] > num[j] && index[i] >= index[j]){
                    index[i] = index[j]+1;
                    prev [i] = j;
                }
            }
        }

    }
}
