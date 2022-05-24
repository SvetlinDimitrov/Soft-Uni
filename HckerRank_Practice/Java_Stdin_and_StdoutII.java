package HckerRank_Practice;

import java.util.Scanner;

public class Java_Stdin_and_StdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        int i = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
//42
//3.1415
//Welcome to HackerRank's Java tutorials!

//String: Welcome to HackerRank's Java tutorials!
//Double: 3.1415
//Int: 42