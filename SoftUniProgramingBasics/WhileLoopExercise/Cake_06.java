package SoftUniProgramingBasics.WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cake = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int cakePiece = cake * cakes ;
        boolean out = false ;
        String stop = scanner.nextLine();
        while (!stop.equals("STOP")){
            int clientPiece = Integer.parseInt(stop);

            if (clientPiece < cakePiece){
                cakePiece -= clientPiece;
            }else if (clientPiece > cakePiece){
                cakePiece = Math.abs(clientPiece - cakePiece);
                out = true ;
                break;
            }
            stop = scanner.nextLine();
        }
        if (out){
            System.out.printf("No more cake left! You need %d pieces more.",cakePiece );
        }else {
            System.out.printf("%d pieces are left.",cakePiece );
        }
    }
}
