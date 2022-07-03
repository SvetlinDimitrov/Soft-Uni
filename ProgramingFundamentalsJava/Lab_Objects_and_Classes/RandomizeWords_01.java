package ProgramingFundamentalsJava.Lab_Objects_and_Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Random rd = new Random();
        int size = words.size();
        for (int i = 0; i < size; i++) {
            int indexRandom = rd.nextInt(words.size());
            System.out.println(words.get(indexRandom));
            words.remove(indexRandom);
        }
    }
}
