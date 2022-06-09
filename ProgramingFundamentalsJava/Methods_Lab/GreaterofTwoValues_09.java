package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class GreaterofTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(GreaterInt(n1 , n2));
        }catch (Exception ignored){

        }

        
    }

    public static int GreaterInt(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public static char GreaterChar(char c1, char c2) {
        if ( c1 > c2){
            return c1;
        }else {
            return  c2;
        }
    }

    public static String LongestString(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }
}
