package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitOrVegetable09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thing = scanner.nextLine();
//        if ( thing.equals("banana") || thing.equals("apple") || thing.equals("kiwi") || thing.equals("cherry") || thing.equals("lemon") || thing.equals("grapes")) {
//            System.out.println ("fruit" ) ;
//        }else if ( thing.equals("tomato") || thing.equals("cucumber") || thing.equals("pepper") || thing.equals("carrot")) {
//            System.out.println("vegetable");
//        }else {
//            System.out.println("unknown") ;
//        }
        switch (thing) {
            case "banana" :
            case "apple" :
            case "kiwi" :
            case "cherry" :
            case "lemon" :
            case "grapes" :
                System.out.println ("fruit" ) ;
                break;
            case "tomato" :
            case "cucumber" :
            case "pepper" :
            case "carrot" :
                System.out.println("vegetable");
                break;
            default :
                System.out.println("unknown") ;
                break;
        }
    }
}
//        •	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
//        •	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//        •	Всички останали са "unknown"
//        Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
