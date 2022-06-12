package ProgramingFundamentalsJava.More_Exercises_Methods;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String word = scanner.nextLine();
        DataTypeReader(command , word);
    }
    public static void DataTypeReader (String something , String wordNumber){
        if (something.equals("int")){
            int number = Integer.parseInt(wordNumber);
            System.out.println(number*2);
        }else if (something.equals("real")){
            double real = Double.parseDouble(wordNumber);
            System.out.printf("%.2f",real * 1.5);
        } else {
            System.out.printf("$%s$", wordNumber);
        }
    }
}
