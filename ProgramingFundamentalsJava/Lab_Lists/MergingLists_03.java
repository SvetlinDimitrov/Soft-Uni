package ProgramingFundamentalsJava.Lab_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> words2 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int times = Math.min(words.size() , words2.size());
        List<String> copyArray = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            copyArray.add(words.get(i));
            copyArray.add(words2.get(i));
        }

        if(words.size() > words2.size()){
            copyArray.addAll(words.subList(times , words.size()));
        }else{
            copyArray.addAll(words2.subList(times , words2.size()));
        }
        System.out.println(String.join(" " , copyArray));
    }
}
