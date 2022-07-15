package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(", ");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() >= 3 && arr[i].length()<=16){
                boolean print = true;
                for (int j = 0; j < arr[i].length(); j++) {
                    if(!Character.isDigit(arr[i].charAt(j)) && !Character.isLetter(arr[i].charAt(j)) && arr[i].charAt(j) != '-' && arr[i].charAt(j) != '_' ){
                        print = false;
                        break;
                    }
                }
                if(print){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
//Has a length between 3 and 16 characters.
//Contains only letters, numbers, hyphens, and underscores.