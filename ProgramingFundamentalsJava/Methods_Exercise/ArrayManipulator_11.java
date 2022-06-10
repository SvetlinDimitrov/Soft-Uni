package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split(" ");
        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("end")) {
            if (commands[0].equals("exchange")) {
                int n = Integer.parseInt(commands[1]);
                if (n >= word.length) {
                    System.out.println("Invalid index");
                } else {
                    Exchange(word, n);
                }
            }else if (commands[0].equals("max") || commands[0].equals("min")){
                if (MinMaxEvenOdd(word,commands[0],commands[1]) < 0){
                    System.out.println("No matches");
                }else{
                    System.out.println(MinMaxEvenOdd(word,commands[0],commands[1]));
                }
            }else{
                int n = Integer.parseInt(commands[1]);
                if(n > word.length){
                    System.out.println("Invalid count");
                }else{
                    System.out.println(firstLastEvenOdd(word,commands[0],n,commands[2] ));
                }
            }


            commands = scanner.nextLine().split(" ");
        }
        System.out.println(Arrays.toString(word));

    }

    public static String[] Exchange(String[] word, int num) {
        for (int i = 0; i <=num; i++) {
            String saveWord = word[0];

            for (int j = 0; j < word.length - 1; j++) {
                word[j] = word[j + 1];
            }
            word[word.length - 1] = saveWord;
        }
        return word;
    }


    public static int MinMaxEvenOdd(String word[], String minMax, String oddEven) {
        int[] numbers = Arrays.stream(word).mapToInt(Integer::parseInt).toArray();
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        if (minMax.equals("max")) {
            if (oddEven.equals("odd")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    if ((numbers[i] > maxValue) && (numbers[i] % 2 != 0)) {
                        maxValue = numbers[i];
                    }
                }

            } else {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    if ((numbers[i] > maxValue) && (numbers[i] % 2 == 0)) {
                        maxValue = numbers[i];
                    }
                }

            }
        } else {
            if (oddEven.equals("odd")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    if ((numbers[i] < minValue) && (numbers[i] % 2 != 0)) {
                        minValue = numbers[i];
                    }
                }

            } else {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    if ((numbers[i] < minValue) && (numbers[i] % 2 == 0)) {
                        minValue = numbers[i];
                    }
                }

            }
        }
        if (minMax.equals("min")) {
            if (minValue == Integer.MAX_VALUE) {
                return -1;
            } else {
                return IndexFinder(numbers,minValue);
            }
        }else{
            if (maxValue == Integer.MIN_VALUE) {
                return -1;
            } else {
                return IndexFinder(numbers,maxValue);
            }
        }
    }
    public static int IndexFinder (int [] array , int number){
        int index =0;
        for (int i = 0; i <= array.length-1 ; i++) {
            if (number == array[i]){
                index = i;
            }
        }
        return index;
    }
    public static String firstLastEvenOdd (String [] words , String firstLast , int number , String evenOdd){
        String print ="";
        int [] numbers = Arrays.stream(words).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        if(firstLast.equals("first")){

            if(evenOdd.equals("even")){
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    if(numbers[i] % 2 ==0){
                        print+= String.format("%d",numbers[i]);
                        count++;
                        if(count == number){
                            break;
                        }
                    }
                }
            }else{
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    if(numbers[i] % 2 !=0){
                        print+= String.format("%d",numbers[i]);
                        count++;
                        if(count == number){
                            break;
                        }
                    }
                }
            }
        }else{
            if(evenOdd.equals("even")){
                for (int i =numbers.length-1 ; i >= 0 ; i--) {
                    if(numbers[i] % 2 ==0){
                        print+= String.format("%d",numbers[i]);
                        count++;
                        if(count == number){
                            break;
                        }
                    }
                }
            }else{
                for (int i =numbers.length-1 ; i >= 0 ; i--) {
                    if(numbers[i] % 2 !=0){
                        print+= String.format("%d",numbers[i]);
                        count++;
                        if(count == number){
                            break;
                        }
                    }
                }
            }
        }

        if(print.equals("")){
            return "[]";
        }else{
        String [] copy = print.split("");
        return Arrays.toString(copy);
        }
    }
}
