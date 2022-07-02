package AlgorithmsFundamentalsWithJava.Searching_Sorting_and_Greedy_Algorithms_Lab;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int [] array = {2 , 9 ,2 ,1 ,5 ,6, 4,2};
        int index =search(array , num) ;
        if(index < 0 ){
            System.out.println("Error 404");
        }else{
            System.out.printf("Yor number is at index %d",index);
        }
    }

    private static int search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]){
                return  i;
            }
        }
        return -1;
    }
}
