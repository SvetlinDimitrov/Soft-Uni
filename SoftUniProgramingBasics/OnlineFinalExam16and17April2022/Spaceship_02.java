package SoftUniProgramingBasics.OnlineFinalExam16and17April2022;

import java.util.Scanner;

public class Spaceship_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double p3 = Double.parseDouble(scanner.nextLine());
        double p3da = Double.parseDouble(scanner.nextLine());

        double rocket = p1 * p2 * p3;
        double room = (p3da + 0.4)*2*2;
        double spaceDorCrew = Math.floor(rocket/room) ;

        if ( spaceDorCrew < 3){
            System.out.println("The spacecraft is too small.");
        }else if ( spaceDorCrew <=10){
            System.out.printf("The spacecraft holds %.0f astronauts.",spaceDorCrew);
        }else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
//•	Ако броят на астронавтите е между 3 (вкл.) и 10 (вкл.):
//"The spacecraft holds {броя на астронавтите} astronauts."
//•	Ако  броят на астронавтите е по-малък от 3:
// "The spacecraft is too small."
//•	Ако  броят на астронавтите е по-голям от 10:
//"The spacecraft is too big."

//•	На първия ред е широчината на кораба - реално число в интервала [1.00... 10.00]
//•	На втория ред е  дължината на кораба - реално число в интервала [1.00…10.00]
//•	На третия ред е височината на кораба - реално число в интервала [1.00…20.00]
//•	На четвъртия ред е средната височина на астронавтите  -  реално число в интервала [1.50 … 1.90]