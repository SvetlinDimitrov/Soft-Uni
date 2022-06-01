package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayofStrings_04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseArrayOfStrings(scanner);
    }
    public static void ReverseArrayOfStrings (Scanner scanner){
        String [] name = scanner.nextLine().split(" ");
        for (int i = 0; i < name.length/2; i++) {
            String saveString =name[name.length-1-i];
            name[name.length-1-i] = name[i];
            name[i] = saveString;
        }
        for(String letters : name){
            System.out.printf("%s ",letters);
        }
    }
}
