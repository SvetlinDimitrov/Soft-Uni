package ProgramingFundamentalsJava.More_Exercisee_Strings_and_Text_Processing;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  [] word = scanner.nextLine().split(" \\| ");
        StringBuilder secretLetter = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            String [] letters = word[i].split(" ");

            for (int j = 0; j <letters.length ; j++) {
                secretLetter.append(morseCode(letters[j]));
            }
            secretLetter.append(" ");
        }
        System.out.println(secretLetter.toString());

    }

    private static String morseCode(String letter) {
        switch (letter){
            case ".-":
                return "A";

            case "-...":
                return "B";

            case "-.-.":
                return "C";

            case "-..":
                return "D";

            case ".":
                return "E";

            case "..-.":
                return "F";

            case "--.":
                return "G";

            case "....":
                return "H";

            case "..":
                return "I";

            case ".---":
                return "J";

            case "-.-":
                return "K";

            case ".-..":
                return "L";

            case "--":
                return "M";

            case "-.":
                return "N";

            case "---":
                return "O";

            case ".--.":
                return "P";

            case "--.-":
                return "Q";

            case ".-.":
                return "R";

            case "...":
                return "S";

            case "-":
                return "T";

            case "..-":
                return "U";

            case "...-":
                return "V";

            case ".--":
                return "W";

            case "-..-":
                return "X";

            case "-.--":
                return "Y";

            case "--..":
                return "Z";


            case "-----":
                return "0";

            case ".----":
                return "1";

            case "..---":
                return "2";

            case "...--":
                return "3";

            case "....-":
                return "4";

            case ".....":
                return "5";

            case "-....":
                return "6";

            case "--...":
                return "7";

            case "---..":
                return "8";

            case "----.":
                return "9";

            default:
                return "";
        }
    }
}
