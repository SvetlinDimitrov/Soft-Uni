package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class Mathoperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.nextLine();
        char c1 = scanner.nextLine().charAt(0);
        int n2 = scanner.nextInt();

        System.out.println(Result(c1 , n1 , n2));
    }
    public static int Result (char c1 , int n1 , int n2){
        if(c1 == '+'){
            return n1+n2;
        }else if (c1 =='-'){
            return n1-n2;
        }else if (c1 == '*'){
            return n1*n2;
        }else {
            return n1/n2;
        }
    }
}
