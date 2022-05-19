package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=n1 ; i++) {
            for (int j = 0; j <=n2 ; j++) {
                for (int k = 0; k <=n5 ; k++) {
                    if (((i*1) + (j*2) + (k*5) )== sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);
                    }

                }

            }

        }
    }
}
//1.	Брой монети по 1лв. - цяло положително число;
//2.	Брой монети по 2лв. - цяло положително число;
//3.	Брой банкноти по 5лв. - цяло положително число;
//4.	Сума - цяло положително число в интервала [1…1000];