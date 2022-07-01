package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_01 {
    public static String save ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split("\\s+");
        print(stringArr, stringArr.length-1);
    }

    private static void print(String [] words,int index) {
        if(index<0){
            if (save.contains("null")){
               save = save.replace("null" , "");
            }
            System.out.println(save);
            return;
        }
        save += String.format("%s ",words[index]);
        print(words, index-1);
    }
}
