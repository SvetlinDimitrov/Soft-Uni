package AlgorithmsFundamentalsWithJava.Searching_Sorting_and_Greedy_Algorithms_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        int find = Integer.parseInt(scanner.nextLine());
        System.out.println(binorySurch(num , find));
    }

    private static int binorySurch(int[] num, int find) {
        int start = 0;
        int end = num.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            int currentNum = num[mid];
            if(find < currentNum){
                end = mid-1;
            }else if ( find > currentNum){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return  -1 ;

    }

}
