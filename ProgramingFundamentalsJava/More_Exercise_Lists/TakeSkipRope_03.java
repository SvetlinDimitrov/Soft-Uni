package ProgramingFundamentalsJava.More_Exercise_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        boolean out = false ;
        for (int i = 0; i <= input.size()-1; i++) {

            if(Indicator(input.get(i))){
                numbers.add(Integer.parseInt(input.get(i)));
            }
        }
        input.removeIf(n-> n.equals("0") || n.equals("1") || n.equals("2") || n.equals("3")|| n.equals("4") || n.equals("5")|| n.equals("6")|| n.equals("7") || n.equals("8")|| n.equals("9") );
        List<Integer> skipList = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        for (int i = 0; i <= numbers.size()-1; i++) {
            if(i%2==0){
                takeList.add(numbers.get(i));
            }else{
                skipList.add(numbers.get(i));
            }
        }
        String text ="";
        try {
            for (int i = 0; i < Math.min(skipList.size(), takeList.size()); i++) {
                int take = takeList.get(i);
                int skip = skipList.get(i);
                    for (int j = 0; j < take; j++) {
                        text += String.format("%s", input.get(j));
                        input.set(j, "     ");
                    }
                input.removeIf(n -> n.equals("     "));
                for (int j = 0; j < skip; j++) {
                    input.set(j, "     ");
                }
                input.removeIf(n -> n.equals("     "));
            }
        }catch (Exception e){

        }
        System.out.println(text);


    }
    public static boolean Indicator (String word){
        return word.equals("0") || word.equals("1") || word.equals("2") || word.equals("3")|| word.equals("4") || word.equals("5")|| word.equals("6") || word.equals("7")|| word.equals("8") || word.equals("9");
    }
    public static String take (List<String> words ,int start , String fusion){
        for (int i = 0; i <= start ; i++) {
            fusion += String.format("%s", words.get(i));
            words.remove(i);
        }
        return fusion;
    }
}
