package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class UniquePINCodes_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <=firstNumber ; i++) {
            for (int j = 2; j <= secondNumber ; j++) {
                for (int k = 2; k <=thirdNumber ; k++) {
                    if(i%2==0){
                        if(j == 2 || j==3 || j == 5 || j ==7){
                            if ( k%2==0){
                                System.out.printf("%d %d %d%n",i,j,k);
                            }
                        }
                    }

                }
            }
        }
    }
}
//•	Горната граница на първото число - цяло число в диапазона [1...9]
//•	Горната граница на второто число - цяло число в диапазона [1...9]
//•	Горната граница на третото число - цяло число в диапазона [1...9]