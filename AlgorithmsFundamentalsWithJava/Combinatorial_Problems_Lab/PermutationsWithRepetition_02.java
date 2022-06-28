package AlgorithmsFundamentalsWithJava.Combinatorial_Problems_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PermutationsWithRepetition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> copy = new ArrayList<>();
        permutations( copy ,words , 0);

    }

    private static void permutations(List<String> copy,List<String> words, int index) {
        if(copy.equals(words)){
            return;
        }
        if(index == words.size()){
            copyTheList(copy , words);
            System.out.println(String.join(" ",words));
            return;
        }

        permutations(copy , words , index+1);
        for (int i = index+1; i < words.size() ; i++) {
            swapp(words , index , i);
            permutations(copy , words , index+1);
            swapp(words , index , i);
        }
    }

    private static void copyTheList(List<String> copy, List<String> words) {
        if(copy.isEmpty()){
            for (int i = 0; i < words.size(); i++) {
                copy.add(words.get(i));
            }
        }
        for (int i = 0; i < words.size()  ; i++) {
            copy.set(i , words.get(i));
        }
    }

    private static void swapp(List<String> words, int index, int end) {
        String save = words.get(index);
        words.set(index , words.get(end));
        words.set(end , save);
    }

}
