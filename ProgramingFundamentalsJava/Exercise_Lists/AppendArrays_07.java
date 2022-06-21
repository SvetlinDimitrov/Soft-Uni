package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> string = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(string);
        String input = string.toString();
        System.out.println(input.replace("," , "").replace("   ", " ") .replace("  ", " ") . replace("[" , "").replace("]" , "").trim());

    }
}
