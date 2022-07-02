package AlgorithmsFundamentalsWithJava.Searching_Sorting_and_Greedy_Algorithms_Lab;

import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,3,4,2};
        ssort(arr);
        for (Integer numbers : arr){
            System.out.printf("%d ",numbers);
        }
    }

    private static void ssort(int[] arr) {
        murgeSort(arr , 0 , arr.length-1);
    }

    private static void murgeSort(int[] arr, int begin, int end) {
        if ( begin >= end){
            return;
        }
        int mid = (begin+end)/2;

        murgeSort(arr , begin , mid);
        murgeSort(arr , mid+1 , end);

        merge(arr , begin , mid , end);

    }

    private static void merge(int[] arr, int begin, int mid, int end) {
        if(mid < 0 || mid >= arr.length || arr[mid] < arr[mid+1]){
            return;
        }
        int left = begin;
        int right = mid + 1;

        int [] helper = new int[arr.length];
        for (int i = begin ; i <end ; i++) {
            helper[i] = arr[i];
        }

        for (int i = begin; i <= end ; i++) {
            if(left > mid) {
                arr[i] = helper[right++];
            }else if  ( right > end){
                arr[i] = helper[left++];
            }else if (helper[left] < helper[right]){
                arr[i] = helper[left++];
            }else{
                arr[i] = helper[right++];
            }

        }
    }
}
