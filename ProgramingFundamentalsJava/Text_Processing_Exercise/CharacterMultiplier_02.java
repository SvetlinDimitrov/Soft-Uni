package ProgramingFundamentalsJava.Text_Processing_Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] word = scanner.nextLine().split(" ");

        if (word[0].length() > word[1].length()){
            CharacterMulti(word[0] , word[1]);
        }else{
            CharacterMulti(word[1] , word[0]);
        }
    }

    private static void CharacterMulti(String longer, String shorter) {
        int sum = 0;

        for (int i = 0; i < longer.length(); i++) {
            if(shorter.length()  > i){
                sum += (int)(longer.charAt(i)) * (int)(shorter.charAt(i));

            }else {
                sum+= (int)(longer.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
