package ProgramingFundamentalsJava.Arrays_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseArrayofStrings_Lists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int size = words.size();
        for (int i = 0; i < words.size()/2; i++) {
            String saveWord = words.get(i);
            words.set(i ,words.get(words.size()-1-i));
            words.set(words.size()-1-i , saveWord);
        }
        System.out.println(String.join(" ",words));
    }
}
