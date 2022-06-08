package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        add(action , num1 , num2);
        multiply(action , num1 , num2);
        subtract(action , num1 , num2);
        divide(action , num1 , num2);
    }
    public static void  add (String name , int number1 , int number2){
        if(name.equals("add")){
            System.out.println(number1+number2);
        }
    }
    public static void  multiply (String name , int number1 , int number2) {
        if (name.equals("multiply")) {
            System.out.println(number1 * number2);
        }
    }
    public static void  subtract (String name , int number1 , int number2) {
        if (name.equals("subtract")) {
            System.out.println(number1 - number2);
        }
    }
    public static void  divide (String name , int number1 , int number2) {
        if (name.equals("divide")) {
            System.out.println(number1 / number2);
        }
    }
}
//("add", "multiply", "subtract", "divide")