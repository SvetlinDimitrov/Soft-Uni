package ProgramingFundamentalsJava.Text_Processing_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] wordsToHide = scanner.nextLine().split("[, .-]+");
        String text = scanner.nextLine();

        for (int i = 0; i < wordsToHide.length; i++) {
            while (text.contains(wordsToHide[i])){
                text = text.replace(wordsToHide[i] , stars(wordsToHide[i]));
            }
        }
        System.out.println(text);
    }

    private static String stars(String s) {
        String stars = "";
        for (int i = 0; i <s.length() ; i++) {
            stars+="*";
        }
        return stars;
    }
}
