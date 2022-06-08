package ProgramingFundamentalsJava.More_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt_Sort_and_Print_Array_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int [] easyWay = new int [times];
        for (int i = 0; i < times; i++) {
            String names = scanner.nextLine();
            int sum = 0;


            for (int j = 0; j <= names.length()-1; j++) {
                char letter = names.charAt(j);
                if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u' ) {
                    sum += (int)letter * names.length();
                }else{
                    sum += (int)letter / names.length();
                }
            }
            easyWay [i] = sum;

        }
        Arrays.sort(easyWay);
        for (int sorted : easyWay){
            System.out.println(sorted);
        }
    }
}
