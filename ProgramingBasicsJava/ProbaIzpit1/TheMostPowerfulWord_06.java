package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int points = 0;
        int maxPoints = Integer.MIN_VALUE;
        String bestWord = "";

        while(!word.equals("End of words")){
            int longWord = word.length();
            points=0;

            for (int i = 1; i <=longWord ; i++) {
                int ASCII = word.charAt(i-1);
                points +=ASCII;

            }
            char wordd = word.charAt(0);
            if (wordd == 'A'|| wordd == 'E'||wordd == 'I'||wordd == 'O'||wordd == 'U'||wordd == 'Y'){
                points = points * longWord;
            }else {
                points = points /3;
            }
            if ( maxPoints < points){
                maxPoints = points;
                bestWord = word;

            }


            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d",bestWord,maxPoints);
    }
}
