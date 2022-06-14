package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZigZagArrays_Lists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print1 = "";
        String print2 = "";
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
            List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            if(i%2==0){
                print1 += String.format("%s ",words.get(0));
                print2 += String.format("%s ",words.get(1));

                }else{
                print1 += String.format("%s ",words.get(1));
                print2 += String.format("%s ",words.get(0));
            }
        }
        System.out.println(print1);
        System.out.println(print2);
    }
}
