package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class VowelsSum_while_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordLong = word.length();
        int i = 0;
        int sum = 0;
        while (i < wordLong) {
            char wordChar = word.charAt(i);
            switch (wordChar) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
            i++;
        }
        System.out.printf("%d",sum);
    }
}
//a	e	i	o	u
//1	2	3	4	5