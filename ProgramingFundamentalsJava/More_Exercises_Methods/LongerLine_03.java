package ProgramingFundamentalsJava.More_Exercises_Methods;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] coordinate = new int [4];
        int [] coordinate2 = new int [4];
        double longest = Double.MIN_VALUE;
        String longCoordinate = "";

        for (int i = 0; i <= coordinate.length-1 ; i++) {
            coordinate[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <= coordinate.length-1 ; i++) {
            coordinate2[i] = Integer.parseInt(scanner.nextLine());
        }
        double sum = Closest(coordinate[0],coordinate[1],coordinate[2],coordinate[3] );
        double sum2 = Closest(coordinate2[0],coordinate2[1],coordinate2[2],coordinate2[3] );
        if ( sum>sum2){
            System.out.printf("(%d, %d)(%d, %d)",coordinate[2],coordinate[3],coordinate[0],coordinate[1]);
        }else {
            System.out.printf("(%d, %d)(%d, %d)",coordinate2[2],coordinate2[3],coordinate2[0],coordinate2[1]);
        }



    }
    public static double Closest (int x ,  int y , int x1 , int y1){
        return   Math.sqrt((Math.pow(x1 - x , 2)) + Math.pow(y1 - y , 2));

    }

}


