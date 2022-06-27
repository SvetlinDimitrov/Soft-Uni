package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;


import java.util.Scanner;

public class PermutationsWithoutRepetitions_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split("\\s+");
        String [] copyMassive = new String [stringArr.length];
        boolean [] noCopy = new boolean[stringArr.length];
        Permutation(stringArr,copyMassive,0 , noCopy);
    }

    private static void Permutation(String[] stringArr ,String [] copy , int index , boolean [] noCopy) {
        if(index == stringArr.length){
            System.out.println(String.join(" " , copy));
            return;
        }
        for (int i = 0; i < stringArr.length; i++) {
            if(!noCopy[i]){
                copy[index] = stringArr[i];
                noCopy[i] = true;
                Permutation(stringArr , copy , index+1 , noCopy);
                noCopy[i] = false;
            }





        }
    }
}
