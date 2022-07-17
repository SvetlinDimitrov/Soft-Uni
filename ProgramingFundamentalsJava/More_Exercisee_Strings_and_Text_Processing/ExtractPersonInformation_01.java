package ProgramingFundamentalsJava.More_Exercisee_Strings_and_Text_Processing;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
            String word = scanner.nextLine();
            String name = word.substring(word.indexOf("@")+1 , word.indexOf("|"));
            String years = word.substring(word.indexOf("#")+1 , word.indexOf("*"));
            System.out.printf("%s is %s years old.%n",name , years);
        }
    }
}
