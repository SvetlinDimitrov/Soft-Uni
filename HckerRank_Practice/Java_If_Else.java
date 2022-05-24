package HckerRank_Practice;

import java.util.Scanner;

public class Java_If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (2 <= n && n <= 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0  && n <= 20) {
            System.out.println("Weird");
        }else {
            System.out.println("Not Weird");
        }
    }
}
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird