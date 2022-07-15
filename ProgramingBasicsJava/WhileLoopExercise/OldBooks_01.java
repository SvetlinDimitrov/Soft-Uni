package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String dreamBook = scanner.nextLine();
        int check = 0;
        boolean findbook = false ;

        while (!dreamBook.equals(book)) {
            if ( dreamBook.equals("No More Books")) {
                findbook = true;
                break;
            }
            check += 1;
                dreamBook = scanner.nextLine();


        }
        if (findbook){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",check);
        }else {
            System.out.printf("You checked %d books and found it.",check);
        }
    }
}
