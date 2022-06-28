package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.Scanner;

public class VariationsWithRepetition_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        int end = Integer.parseInt(scanner.nextLine());
        String [] copy = new String [end];
        VariationsRep(arr , copy , 0);
    }

    private static void VariationsRep(String[] arr, String[] copy, int index) {
        if(index>= copy.length){
            System.out.println(String.join(" ",copy));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            copy[index] = arr[i];
            VariationsRep(arr , copy , index+1);
        }
    }
}
