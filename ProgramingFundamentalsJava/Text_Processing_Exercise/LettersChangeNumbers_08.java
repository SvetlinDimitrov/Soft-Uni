package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split("\\s+");
        double [] allNum = new double [word.length];
        int count = 0;


        for (String words : word){
            double sum = 0;

            for (int i = 0; i < words.length(); i++) {
                char currentChar = words.charAt(i);
                int alphabetChar = ConverterChar(words.toLowerCase().charAt(i));
                int currentNumWord = GetCurrentNum(words);
                if(Character.isLetter(currentChar) && i==0){
                    if(Character.isUpperCase(currentChar)){
                        sum = currentNumWord*1.0/alphabetChar;
                    }else{
                        sum= currentNumWord*alphabetChar;
                    }
                }else if (Character.isLetter(currentChar) && i!=0){
                    if(Character.isUpperCase(currentChar)){
                        sum = sum -alphabetChar;
                    }else{
                        sum= sum + alphabetChar;
                    }
                }
            }
            allNum[count] = sum;
            count++;
        }
         double finalSum = 0;
        for (Double numbers : allNum){
            finalSum+=numbers;
        }
        System.out.printf("%.2f",finalSum);
    }


    private static int GetCurrentNum(String words) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i <words.length() ; i++) {
            if(Character.isDigit(words.charAt(i))){
                num.append(words.charAt(i));
            }
        }
        return Integer.parseInt(num.toString());
    }

    private static int ConverterChar(char letter) {

        switch (letter){
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            case 'k':
                return 11;
            case 'l':
                return 12;
            case 'm':
                return 13;
            case 'n':
                return 14;
            case 'o':
                return 15;
            case 'p':
                return 16;
            case 'q':
                return 17;
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            case 'u':
                return 21;
            case 'v':
                return 22;
            case 'w':
                return 23;
            case 'x':
                return 24;
            case 'y':
                return 25;
            case 'z':
                return 26;
            default:
                return -1;
        }
    }

}
