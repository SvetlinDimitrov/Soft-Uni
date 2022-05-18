package SoftUniProgramingBasics.FirstStebInPrograming;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String name = scanner.nextLine() ;
        int projects = Integer.parseInt(scanner.nextLine());
        int chas = projects * 3 ;
        System.out.print("The architect " + name+" will need " + chas + " hours to complete " + projects + " project/s.");

    }
}
