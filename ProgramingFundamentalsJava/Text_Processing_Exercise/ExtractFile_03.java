package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split("[\\\\]+");
        String name = words[words.length-1].split("\\.")[0];
        String type = words[words.length-1].split("\\.")[1];
        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s",type);
    }
}
