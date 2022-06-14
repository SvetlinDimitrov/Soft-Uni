package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommonElements_Lists_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> words2 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());



            for (int i = 0; i <= words2.size()-1; i++) {

                for (int j = 0; j <= words.size()-1; j++) {
                    if(words2.get(i).equals(words.get(j))){
                        System.out.printf("%s ",words2.get(i));

                }
            }
        }
    }
}
