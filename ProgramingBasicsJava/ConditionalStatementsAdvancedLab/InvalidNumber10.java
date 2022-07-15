package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
//        if ((number >= 100 && number <= 200) || number == 0) {
//
//        } else {
//            System.out.println("invalid");
//        }
      boolean  numberr = (number >= 100 && number <= 200 ) || number ==0 ;
      if (numberr) {

        }else {
          System.out.println("invalid");
      }


    }
}
   // Дадено число е валидно, ако е в диапазона [100…200] или е 0