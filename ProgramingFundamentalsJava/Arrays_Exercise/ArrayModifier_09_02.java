package ProgramingFundamentalsJava.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer ::parseInt).toArray();
        String [] com = scanner.nextLine().split(" ");

        while(!com[0].equals("end")){
            if (com[0].equals("swap")) {
            numbersArray = swap(com,numbersArray);
            }
            else if ((com[0].equals("multiply"))){
                numbersArray = multiply(com,numbersArray);
            }
            else{
                numbersArray = decrease(com,numbersArray);
            }



            com = scanner.nextLine().split(" ");

        }
        for (int numbers : numbersArray){
           System.out.printf("%d ",numbers);
        }

    }
    public static int[] swap (String [] words,int [] num ){
        if (words[0].equals("swap")){
            int n1 = Integer.parseInt(words[1]);
            int n2 = Integer.parseInt(words[2]);
            int saveNumber = num[n1];
            num[n1] = num[n2];
            num [n2] = saveNumber;

        }
        return num;
    }
    public static int[] multiply  (String [] words,int [] num ) {
        if (words[0].equals("multiply")) {
            int n1 = Integer.parseInt(words[1]);
            int n2 = Integer.parseInt(words[2]);
            num[n1]= num[n1] * num[n2];
        }
        return num;
    }
    public static int[] decrease  (String [] words,int [] num ) {
        if (words[0].equals("decrease")) {
            for (int i = 0; i <= num.length-1; i++) {
                num[i]-=1;
            }
        }
        return num;
    }

}
