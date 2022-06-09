package ProgramingFundamentalsJava.Methods_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toCopy = scanner.nextLine();
        int timesToCopy = Integer.parseInt(scanner.nextLine());
        System.out.println(copyStringTimes(toCopy , timesToCopy));

    }
    public static String copyStringTimes(String toCopy , int times ){
        String newString = "";
        for (int i = 0; i < times; i++) {
            newString+=String.format("%s",toCopy);

        }
        return  newString;
    }
}
