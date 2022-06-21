package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("3:1")){

            if(command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                String merge = "";
                if ( startIndex >= input.size()-1){

                }else if (startIndex < input.size()-1 && endIndex >= input.size()-1){
                    for (int i = startIndex-1; i <=input.size() ; i++) {
                        merge+= input.get(startIndex);
                        input.remove(startIndex);
                    }
                    input.add(startIndex , merge);
                }else {
                    for (int i = startIndex; i <= endIndex; i++) {
                        merge += input.get(startIndex);
                        input.remove(startIndex);
                    }
                    input.add(startIndex , merge);
                }

            }else {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
                String word = input.get(index);
                int half = word.length() / partitions;
                input.remove(index);
                int start = 0;


                for (int i = 1 ; i < partitions; i++) {
                    input.add(index , word.substring(start , start+half ));
                    index++;
                    start+=half;
                }
                input.add(index , word.substring(start));
            }




            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",input));
    }
    public static List<Character> transfer (String word){
        List<Character> trans = new ArrayList<>();
        for (int i = 0; i <= word.length()-1; i++) {
            trans.add(word.charAt(i));
        }
        return trans;
    }
}
