package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cinema_07 {
    public static List<String> namesGranded;
    public static List<String> namesGrandedCopy;
    public static String [] saveNames;
    public static boolean [] isUsed;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        namesGranded = new ArrayList<>();
        namesGrandedCopy = new ArrayList<>();


        print(namesGranded , words);

        String command = scanner.nextLine();
        while(!command.equals("generate")){
            int index = Integer.parseInt(command.split(" - ")[1]) - 1;
            String name = command.split(" - ")[0];
            if(words.contains(name)) {
                namesGranded.set(index, name);
                words.remove(name);
            }

            command = scanner.nextLine();
        }
        saveNames = new String [words.size()];
        isUsed = new boolean[saveNames.length];
        namesGrandedCopy.addAll(namesGranded);
        Cinema(words , 0);
    }

    private static void Cinema(List<String> words, int index) {
        if(index >= words.size()){
            printFinal(saveNames);
            System.out.println(String.join(" ",namesGrandedCopy));
            for (int i = 0; i < namesGrandedCopy.size(); i++) {
               namesGrandedCopy.set(i , namesGranded.get(i));
            }

            return;
        }
        for (int i = 0; i < words.size(); i++) {
            if(!isUsed[i]) {
                isUsed[i] = true;
                saveNames[index] = words.get(i);
                Cinema(words, index + 1);
                isUsed[i]=false;
            }
        }
    }

    private static void printFinal(String[] saveNames) {
        for (int i = 0; i < saveNames.length; i++) {
            for (int j = 0; j < namesGranded.size(); j++) {
                if(namesGrandedCopy.get(j).equals("-")){
                    namesGrandedCopy.set(j , saveNames[i]);
                    break;
                }
            }

        }
    }


    private static void print(List<String> namesGranded, List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            namesGranded.add("-");
        }
    }
}
