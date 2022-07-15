package SoftUniProgramingBasics.FirstStebInPrograming;

import java.net.SocketOption;
import java.util.Scanner;

public class VacationBooksList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int broiStranici = Integer.parseInt(scanner.nextLine()) ;
        int stranici1chas = Integer.parseInt(scanner.nextLine()) ;
        int broidni = Integer.parseInt(scanner.nextLine()) ;
        int obshtoVremeKniga = broiStranici /  stranici1chas ;
        int chasoveDen = obshtoVremeKniga / broidni ;
        System.out.println(chasoveDen);


    }
}
