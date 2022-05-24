package HckerRank_Practice;

import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 10; i++) {



            System.out.printf("%d x %d = %d%n",N,i,N*i);


        }
    }
}
