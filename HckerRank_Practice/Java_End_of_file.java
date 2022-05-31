package HckerRank_Practice;

import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 ;
        while(scanner.hasNext()){
            count++;
            System.out.printf("%d %s",count,scanner.nextLine());
        }
    }
}
