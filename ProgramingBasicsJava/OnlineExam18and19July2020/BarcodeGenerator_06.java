package SoftUniProgramingBasics.OnlineExam18and19July2020;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int firstN = n/1000;
        int firstMax = max/1000;
        int secondN = (n - firstN*1000)/100;
        int secondMax = (max - firstMax*1000)/100;
        int thirdN = ((n - firstN*1000) - secondN*100)/10;
        int thirdMax = ((max - firstMax*1000) - secondMax*100)/10;
        int lastN = n%10;
        int lastMax = max%10;

        for (int i = firstN; i <=firstMax ; i++) {
            for (int j = secondN; j <=secondMax ; j++) {
                for (int k = thirdN; k <= thirdMax ; k++) {
                    for (int l = lastN; l <= lastMax ; l++) {
                        if (!(i % 2 ==0) && !(j % 2 ==0) && !(k % 2 ==0) && !(l % 2 ==0)){
                            System.out.printf("%d%d%d%d ", i,j,k,l);
                        }

                    }

                }

            }


        }
    }
}
