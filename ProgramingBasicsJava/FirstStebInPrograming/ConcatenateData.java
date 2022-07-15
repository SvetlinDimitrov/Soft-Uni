package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String ime = scanner.nextLine() ;
        String prezime = scanner.nextLine() ;
        int age = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine() ;
        System.out.println ( " You are " + ime +" " + prezime + ", a " + age +"-years old person from "+grad + ".") ;
    }
}
