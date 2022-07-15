package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class AnimalType03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        switch (name) {
//            case "dog" :
//                System.out.println("mammal");
//                break ;
//            case "crocodile":
//            case "tortoise":
//            case "snake":
//                System.out.println("reptile");
//                break;
//            default :
//                System.out.println("unknown");
//                break;
//        }
        if (name.equals("dog")){
            System.out.println("mammal");

        }else if (name.equals("crocodile") || name.equals("tortoise") || name.equals("snake") ) {
            System.out.println ( "reptile");
        }else {
            System.out.println("unknown");
        }
    }
}
//        •	dog -> mammal
//        •	crocodile, tortoise, snake -> reptile
//        •	others -> unknown
