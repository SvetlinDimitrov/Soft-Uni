package ProgramingFundamentalsJava.Lab_Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> num = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < num.size()-1; i++) {
            if(num.get(i).equals(num.get(i+1))){
                num.set(i , num.get(i)+num.get(i+1));
                num.remove(i+1);
                i=-1;
            }
        }
        String print = "";
        DecimalFormat df = new DecimalFormat("0.#");
        for (Double number : num){
            print += df.format(number) + " ";
        }
        System.out.println(print);
    }
}
