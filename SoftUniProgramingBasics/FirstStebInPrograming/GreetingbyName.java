package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class GreetingbyName {
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in) ;
        String ime = name.nextLine() ;
        System.out.println("Hello, " + ime + "!") ;
    }
}
