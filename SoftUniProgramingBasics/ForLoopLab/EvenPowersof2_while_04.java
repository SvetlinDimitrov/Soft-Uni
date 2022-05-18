package SoftUniProgramingBasics.ForLoopLab;

import java.util.Scanner;

public class EvenPowersof2_while_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double number = 2 ;
        double i = 0;
        while ( true){
            if ( i > n) {
                break;
            }
            if(i % 2 ==0) {
                number = Math.pow(2, i);
                System.out.printf("%.0f%n", number);
            }
            i++;
                }
            }
        }


