package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class VariationsWithoutRepetitions_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");

        boolean [] here = new boolean[arr.length];
        int end = Integer.parseInt(scanner.nextLine());
        String[] copyArr = new String [end];
        Variations(here ,arr , copyArr , 0);
    }

    private static void Variations(boolean [] here,String[] arr, String[] copyArr, int index) {
        if(index >= copyArr.length){
            System.out.println(String.join(" ",copyArr));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!here[i]){
                here[i] = true;
                copyArr[index] = arr[i];
                Variations(here ,arr,copyArr,index+1);
                here[i] = false;
            }
        }
    }
}
