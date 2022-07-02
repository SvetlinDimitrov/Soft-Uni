package AlgorithmsFundamentalsWithJava.Searching_Sorting_and_Greedy_Algorithms_Lab;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {5,9,1,3,2};
        soort(arr);
        for (Integer numbers : arr){
            System.out.printf("%d ",numbers);
        }
    }

    private static void soort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swasp(arr , i , min );
        }
    }

    private static void swasp(int[] arr , int current , int min) {
        int save = arr[current];
        arr[current] = arr[min];
        arr[min] = save;
    }
}
