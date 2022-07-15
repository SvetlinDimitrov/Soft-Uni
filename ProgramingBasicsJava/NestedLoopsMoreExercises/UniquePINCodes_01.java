package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=n1 ; i++) {
            for (int j = 1; j <=n2 ; j++) {
                for (int k = 1; k <=n3 ; k++) {
                    int count = 0;
                    for (int l = 1; l <=n2 ; l++) {
                        if(j ==1 ){
                            break;
                        }
                        if (j%l == 0 ){
                            count++;
                        }

                    }
                    if (count == 2 && i%2==0 && k %2==0){
                        System.out.printf("%d %d %d%n",i,j,k);
                    }

                }
                
            }
            
        }
    }
}
//•	Горната граница на първото число - цяло число в диапазона [1...9]
//•	Горната граница на второто число - цяло число в диапазона [1...9]
//•	Горната граница на третото число - цяло число в диапазона [1...9]